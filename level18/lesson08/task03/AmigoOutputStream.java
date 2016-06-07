package com.javarush.test.level18.lesson08.task03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends FileOutputStream
{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream outputFile;

    public AmigoOutputStream(FileOutputStream outputFile) throws FileNotFoundException ,IOException
    {
        super(fileName);
        this.outputFile = outputFile;
    }

    @Override
    public void write(int b) throws IOException
    {
        outputFile.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException
    {
        outputFile.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        outputFile.write(b, off, len);
    }

    @Override
    protected void finalize() throws IOException
    {
        super.finalize();
    }

    public void close() throws IOException
    {
        outputFile.flush();
        outputFile.write("JavaRush © 2012-2013 All rights reserved.".getBytes());
        outputFile.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        new AmigoOutputStream(new FileOutputStream(fileName));

    }

}

