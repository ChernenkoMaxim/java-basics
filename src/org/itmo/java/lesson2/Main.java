package org.itmo.java.lesson2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Smartphone", "Samsung", "A51", 1, Color.BLACK, 23000, 120, true);
        Mobile mobile2 = new Mobile("Smartphone", "Xiaomi", "Redmi", 1, Color.WHITE, 15000, 62,true);
        System.out.println(mobile);
        System.out.println(mobile2);

        mobile.setPrice(21500);
        mobile2.setNew(false);
        System.out.println(mobile.getColor());
        System.out.println(mobile2);
    }
}
