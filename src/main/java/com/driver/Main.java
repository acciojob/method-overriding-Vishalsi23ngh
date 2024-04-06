package com.driver;

public class Main {
    public static void main(String[] args) {
        B objB = new B();
        String resultA = objB.meth();
        System.out.println("Result from class A method: " + resultA);

        String resultB = objB.meth();
        System.out.println("Result from class B method: " + resultB);
    }
}