package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String name  = rd.readLine();

        int y = Integer.parseInt(rd.readLine());
        int m = Integer.parseInt(rd.readLine());
        int d = Integer.parseInt(rd.readLine());

        System.out.print("Меня зовут " + name + "\nЯ родился " + d + "." + m + "." + y);
    }
}
