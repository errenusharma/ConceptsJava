package org.automation.java;


import java.util.*;

public class MaxOccuringCharInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        maxChar(str);


    }

    public static void maxChar(String str) {
        int max=0;
        char maxChar =0;
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        char[] charArr = str.replaceAll("\\s+", "").toCharArray();


        for (char ch : charArr){
            if (mp.containsKey(ch))
            {
                mp.put(ch, mp.get(ch)+1);

            } else
            {
                mp.put(ch,1);
            }

        }


       Set<Map.Entry<Character, Integer>> entrySet  = mp.entrySet();

        for(Map.Entry<Character, Integer> i : entrySet){
            Integer num= i.getValue();
            if(num>max){
                max=num;
                maxChar = i.getKey();
            }

        }
        System.out.println("Input String : "+str);

        System.out.println("Maximum Occurring char and its count :");

        System.out.println(maxChar+" : "+max);

    }

}
