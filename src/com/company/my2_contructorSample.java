package com.company;

public class my2_contructorSample {
    public static void main(String[] args) {
        info_sample mycost = new info_sample(5000, 2);
        info_sample mycost1 = new info_sample("블루베리치즈케잌");
        mycost.prn_calc();
    }
}

class info_sample {

    private int cost;
    private int people;

    public info_sample(int a, int b) {
        System.out.println("입력한 정보로 세팅합니다.");
        cost = a;
        people = b;
    }

    public info_sample() {
        System.out.println("가격 freeday");
    }
    public info_sample(String goods_irum) {
                System.out.println(goods_irum+"2만원 균일가 입니다.");
    }

    public void prn_calc() {
        System.out.printf("1인당 가격=%d 전체가격=%d\n", cost, cost * people);
    }
}