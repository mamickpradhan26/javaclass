package com.athang.javatraining.basicjava;

public class Arrays {
    public static void main(String[] args) {
        int a[] = new int[10];
        int n = 5;
        int increment = 5;
        for (int i = 0; i<a.length; i++){
            if(i==0){
            a[i]= n+increment;
        }
            else{
            a[i] = n + increment;
            }
            n = a[i];
        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
