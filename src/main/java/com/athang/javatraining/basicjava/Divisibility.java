package com.athang.javatraining.basicjava;

public class Divisibility {
    public static void main(String[] args) {
        for (int a = 0; a <= 100; a++) {
            if (a%5==0) {
                System.out.print(a+"  ");
            }
            else if(a%3==0){

                System.out.println(a);
            }
            else if(a%3==0 || a%5==0){
                System.out.println(a);

            }
        }
    }
}