package com.javarush.test.level14.lesson06.home01;

/**
 * Created by alex on 23.04.2016.
 * 7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
 Методы должны возвращать строку вида:
 <getDescription() родительского класса>  + <" Моя страна - Sssss. Я несу N яиц в месяц.">
 где Sssss - название страны
 где N - количество яиц в месяц
 */
public class UkrainianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 300;
    }
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
