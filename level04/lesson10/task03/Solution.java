package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sStr = reader.readLine();
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);
        int i = 0;
        while (i < nNum)
        {
            System.out.println(sStr);
            i++;
        }//напишите тут ваш код

    }
}
