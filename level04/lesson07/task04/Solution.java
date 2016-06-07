package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int b = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int c = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int n;
        int m;
        int n1 = pos(a);
        int n2 = pos(b);
        int n3 = pos(c);
        int m1 = neg(a);
        int m2 = neg(b);
        int m3 = neg(c);
        n = n1 + n2 + n3;
        m = m1 + m2 + m3;
        System.out.println("количество отрицательных чисел: " + m);
        System.out.println("количество положительных чисел: " + n);

    }

    public static int pos(int n)
    {
        if (n > 0)
            return 1;
        else
            return  0;

    }

    public static int neg(int m)
    {
        if (m < 0)
            return 1;
        else
            return 0;
    }
}
