package com.company;

public class Main {
    public static void main(String[] args) {

        int num = 576;

        sqrt(num);



    }

    public static UnaryOperator<Double> sqrt(int a){
        UnaryOperator <Double> un = () -> System.out.println(Math.sqrt(a));
        un.method();

        return un;

    }
}