package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream in1 = new FileInputStream(file1);
        FileInputStream in2 = new FileInputStream(file2);

        byte[] buff1 = new byte[in1.available()];
        in1.read(buff1);
        in1.close();

        byte[] buff2 = new byte[in2.available()];
        in2.read(buff2);
        in2.close();

        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        fileOutputStream1.write(buff2);
        fileOutputStream1.close();

        FileOutputStream fileOutputStream11 = new FileOutputStream(file1, true);
        fileOutputStream11.write(buff1);
        fileOutputStream11.close();
    }
}
