package com.javarush.test.level16.lesson07.task03;

import java.util.Date;
/* Big Ben clock
1. Разберись, что делает программа.
2. Реализуй логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе
Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException
        {

            Date date = new Date(2015, 11, 16, hours, minutes, seconds+1);
            Thread.sleep(1000);
            if (date.getHours() == 0 && date.getMinutes() == 0 && date.getSeconds() == 0)
            {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));
                seconds++;
            } else
            {
                System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, date.getHours(), date.getMinutes(), date.getSeconds()));
                seconds++;

            }
        }}}


