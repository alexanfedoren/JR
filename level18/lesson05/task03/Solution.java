package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1in = new FileInputStream(reader.readLine());
        FileOutputStream file2out = new FileOutputStream(reader.readLine());
        FileOutputStream file3out = new FileOutputStream(reader.readLine());
        int insize = file1in.available();
        int count = 0;
        int chet = file1in.available()%2;
        while(file1in.available() > 0)
            {
                int read = file1in.read();
                if (chet == 0)
                {
                    if (count < insize / 2)
                    {
                        file2out.write(read);
                        count++;
                    } else
                    {
                        file3out.write(read);
                        count++;
                    }
                }
                else {
                    {
                        if (count < insize / 2+1)
                        {
                            file2out.write(read);
                            count++;
                        } else
                        {
                            file3out.write(read);
                            count++;
                        }
                    }
                }
            }
        reader.close();
        file1in.close();
        file2out.close();
        file3out.close();
    }
}