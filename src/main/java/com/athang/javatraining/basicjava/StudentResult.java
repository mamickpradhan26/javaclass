package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        StudentResult sr = new StudentResult();
        sr.displayDivision();

    }
    public void displayDivision(){
        System.out.println("Enter Marks: ");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if(marks >= 75 && marks<=100){
            System.out.println("Distinction");
        }
        else if(marks >= 60 && marks<=100 ){
            System.out.println("1st Division");
        }
        else if(marks >= 50 && marks<=100){
            System.out.println("2nd Division");
        }
        else if(marks >= 40 && marks<=100 ){
            System.out.println("3rd Division");
        }
        else if(marks < 40 && marks>=0 ){
            System.out.println("Failed");
        }
        else if(marks<0 || marks>100){
            System.out.println("Enter a valid marks");
        }

        System.out.println("Do you wanna see if they passed or failed?");
        System.out.println("Press \"Y\" for yes \"N\" for No");
        String c = scanner.next();
        if (c == "Y") {
            if (marks >= 40 && marks <= 100) {
                System.out.println("Pappu Pass");
            } else if (marks < 40 && marks >= 0) {
                System.out.println("Pappu Fail");
            } else {
                System.out.println("Please enter Valid marks");
            }

        }
    }

}
