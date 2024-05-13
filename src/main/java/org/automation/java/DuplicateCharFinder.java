package org.automation.java;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharFinder {
    public static void main(String[] args) {
        String inputString= "renusharma";

        char[] name= inputString.toCharArray();
        for(int i=0; i<name.length; i++){
            int count =1;
            for(int j=i+1; j<name.length;j++){
                if (name[i]==name[j]){
                    count++;

                }
            }
            if(count>1){
                System.out.println("duplicate Character found "+ name[i]);}
        }


        //Creating a HashMap containing char as key and it's occurrences as value

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        //Converting given string to char array

        char[] strArray = inputString.toCharArray();

        //checking each char of strArray

        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1

                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value

                charCountMap.put(c, 1);
            }
        }

        //Getting a Set containing all keys of charCountMap

        Set<Character> charsInString = charCountMap.keySet();

        System.out.println("Duplicate Characters In "+inputString);

        //Iterating through Set 'charsInString'

        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count

                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }

}




