package org.automation.java;

import java.util.Scanner;

public class PrimeNumbers
{
    static boolean checkForPrime(int inputNumber)
    {
        boolean isItPrime = true;
        if(inputNumber <= 1)
        {
            isItPrime = false;
            return isItPrime;
        }
        else
        {
            for (int i = 2; i < inputNumber/2; i++) //the check is done till n/2 instead of n as a number is not divisible by more than half its value.
            {
                if ((inputNumber % i) == 0)
                {
                    isItPrime = false;

                    break;
                }
            }
            return isItPrime;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(checkForPrime(12));
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("How many initial prime numbers you want?");
//
//        int n = sc.nextInt();
//
//        int counter = 1;
//
//        int inputNumber = 2;
//
//        System.out.println("Initial "+n+" Prime Numbers :");
//
//        while (counter <= n)
//        {
//            if (checkForPrime(inputNumber))
//            {
//                System.out.println(inputNumber);
//
//                counter++;
//
//                inputNumber++;
//            }
//            else
//            {
//                inputNumber++;
//            }
//        }
//
//        sc.close();
    }
}