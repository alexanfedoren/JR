package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        return s;//напишите тут ваш код

    }

    public static int readInt() throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(r.readLine());
        return i;//напишите тут ваш код

    }

    public static double readDouble() throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(r.readLine());
        return d;//напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        boolean b = Boolean.parseBoolean(r.readLine());
        return b; //напишите тут ваш код

    }
}
