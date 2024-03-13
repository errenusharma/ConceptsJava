package org.automation.java;

import java.util.Scanner;

public class AddTwoIntegers {

    public void addTwoNumber() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int i1 = sc.nextInt();
        System.out.println("Enter the Second number");
        int i2= sc.nextInt();
        int Sum= i1+i2;
        System.out.println("Sum of numbers="+ Sum);
    }

}

