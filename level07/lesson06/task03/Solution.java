package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> listS = new ArrayList<String>();
        ArrayList<Integer> listN = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int i = 0; i < 5; i++)
         {
             String s = reader.readLine();
             listS.add(s);
             listN.add(s.length());
         }

        int a = listN.get(0);

        for (int i = 0; i < listN.size(); i++)
        {
            int b = listN.get(i);
            if (b<a)
                a = b;
        }

        for (int i = 0 ; i < listS.size(); i++)
        {
            if (listS.get(i).length() == a)
                System.out.println(listS.get(i));
        }

        //напишите тут ваш код

    }
}
