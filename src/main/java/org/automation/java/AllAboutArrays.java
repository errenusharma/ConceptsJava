package org.automation.java;

import java.util.Arrays;
import java.util.List;

public class AllAboutArrays {
    public static void main(String[] args) {
        // one way of declaring - assigning memory size first and then adding values to array
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1]= 2;
        arr1[2]=3;
        arr1[3]=4;
        arr1[4]=5;
        for (int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    // another way is to declare and assign values together when you know your values beforehand
        int[] arr2 = {7,8,9};

        for (int i:arr2) {
            System.out.println(i);

        }
        // **IMP** In For loop always put condtio <, <= to avoid array out of index error

        //to convert existing array to Arraylist use below method

        String[] str  = {"Renu", "Sharma"};

        List<String> arrayList = Arrays.asList(str);
        System.out.println(arrayList.contains("Renu"));



    }
}
