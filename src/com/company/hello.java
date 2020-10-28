package com.company;

public class hello {
    public hello() {
        System.out.println("생성자 부분입니다.");
    }

    public void print1() {
        System.out.println("연습입니다.");
    }
}

class my2_sample1 {
    public static void main(String[] args) {
        hello myhello = new hello();
        myhello.print1();
    }
}
