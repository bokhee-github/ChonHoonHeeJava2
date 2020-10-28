package com.company;

public class SchleifenAufgabe {

    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i < 50; i++) {
            int b = a * i;
            System.out.println(b);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
