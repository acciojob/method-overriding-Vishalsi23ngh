package com.driver;

public class Main {
    public static void main(String[] args) {
        B objB = new B();
        String resultA = objB.meth();
        System.out.println("Result from class A method: " + resultA);

        String resultB = objB.meth();
        System.out.println("Result from class B method: " + resultB);
    }
    public static class A {
        public  String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

}