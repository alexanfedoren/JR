package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = reader.readLine();//напишите тут ваш код
        String sNum2 = reader.readLine();//напишите тут ваш код
        String sNum3 = reader.readLine();
        int nNum1 = Integer.parseInt(sNum1);//напишите тут ваш код
        int nNum2 = Integer.parseInt(sNum2);//напишите тут ваш код
        int nNum3 = Integer.parseInt(sNum3);
        if (nNum1 == nNum2)
            System.out.println(3);
        else if (nNum2 == nNum3)
            System.out.println(1);
        else if (nNum1 == nNum3)
            System.out.println(2);//напишите тут ваш код

    }
}
