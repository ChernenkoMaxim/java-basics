package org.itmo.java.lesson2;

public class Calculator {
    public static Double summation(Double a, Double b) {return  a + b; }
    public static Long summation(Long a, Long b) {return a + b; }
    public static Integer summation(Integer a, Integer b) { return a + b; }

    public static Double division(Double a, Double b) { return a / b; }
    public static Double division(Long a, Long b) { return (double) a / b; }
    public static Double division(Integer a, Integer b) { return (double) a / b; }

    public static Double multiplication(Double a, Double b) { return a * b; }
    public static Long multiplication(Long a, Long b) { return a * b; }
    public static Integer multiplication(Integer a, Integer b) { return a * b; }

    public static Double substraction(Double a, Double b) { return a - b; }
    public static Long substraction(Long a, Long b) { return a - b; }
    public static Integer substraction(Integer a, Integer b) { return a - b; }
}
