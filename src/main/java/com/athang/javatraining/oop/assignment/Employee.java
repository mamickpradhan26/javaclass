package com.athang.javatraining.oop.assignment;

public class Employee {
    String name;
    int yearOfJoining;
    int monthlySalary;
    String address;
    int totalEarned;



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", monthlySalary=" + monthlySalary +
                ", address='" + address + '\'' +
                ", totalEarned=" + totalEarned +
                '}';
    }

    public Employee(String name, int yearOfJoining, String address, int monthlySalary){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
        this.monthlySalary = monthlySalary;


    }
    public int totalEarnedMethod (){
        return (((2024-this.yearOfJoining) * 12) * this.monthlySalary);
    }

}
