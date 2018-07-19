package day03;

import day03.exam.basic.Test01;

public class Main {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        System.out.println(Test01.classVariable);   // public static 접근
        System.out.println(test01.a);   // public 접근
    }
}
