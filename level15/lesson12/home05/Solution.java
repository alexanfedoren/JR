package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    Solution(byte a) {}
    Solution(long b) {}
    Solution(int c) {}
    public Solution(char d) {}
    public Solution(String e) {}
    public Solution(Boolean f) {}
    private Solution(float g) {}
    private Solution(double h) {}
    private Solution(Number k) {}
    protected Solution(Object l) {}
    protected Solution(Exception m) {}
    protected Solution(Integer n) {}
}

