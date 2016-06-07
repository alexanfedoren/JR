package com.javarush.test.level02.lesson08.task04;

/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
*/
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {
        int m3;
        int m1 = min(a,b);
        int m2 = min(c,d);
        if (m1<m2)
            m3 = m1;
        else m3 = m2;
        return m3;

    }

    public static int min(int a, int b)
    {
        int m;
        if (a<b)
        m = a;
        else
        m = b;
        return m;//напишите тут ваш код

    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}