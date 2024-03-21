package com.athang.javatraining.oop.assignment;

public class MainApplication {
    public static void main(String[] args) {
        Employee employee = new Employee("Tshering", 2017, "Thimphu", 20000);
        employee.totalEarned = employee.totalEarnedMethod();
        System.out.println(employee);

        Employee employee2 = new Employee("Tashi", 2019, "Bhutan", 30000);
        employee2.totalEarned = employee2.totalEarnedMethod();
        System.out.println(employee2);

        Employee employee3 = new Employee("Sunil", 2020, "Kathmandu", 25000);
        employee3.totalEarned = employee3.totalEarnedMethod();
        System.out.println(employee3);




    }

}
