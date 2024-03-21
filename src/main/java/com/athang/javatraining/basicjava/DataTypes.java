package com.athang.javatraining.basicjava;

public class DataTypes {
    private void sumOfDifferentVar(int a, float b, double c){
        double sum = a + b + c;
        System.out.println(sum);
        float sumFloat = (float) (a+b+c);
        System.out.println(sumFloat);
        int sumInteger = (int)(a+b+c);
        System.out.println(sumInteger);
    }

    public static void main(String [] args){
        DataTypes dt = new DataTypes();
        int x = 10;
        float y = 12.5f;
        double z = 1234.34d;
        dt.sumOfDifferentVar(x,y,z);
    }
}
