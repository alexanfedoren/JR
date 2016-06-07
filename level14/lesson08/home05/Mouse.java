package com.javarush.test.level14.lesson08.home05;

/**
 * Created by alex on 24.04.2016.
 */
public class Mouse implements CompItem
{
    public String getName(){
        return this.getClass().getSimpleName();
    }
}
