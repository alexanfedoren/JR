package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1in = new FileInputStream(reader.readLine());
        FileOutputStream file2out = new FileOutputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (file1in.available()>0)
        {
            int b = file1in.read();
            list.add(b);
        }

        for (int i=list.size()-1; i>=0; --i)
        {
            file2out.write(list.get(i));
        }
        reader.close();
        file1in.close();
        file2out.close();
    }

}
