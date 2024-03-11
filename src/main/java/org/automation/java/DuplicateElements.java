package org.automation.java;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        String[] names = {"Java", "Javascript", "C", "Ruby", "Java"};

        //1. without using collection inherent methods - worst solution - Time Complexity : O(nXn)
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate element is :" + names[i]);
                }
            }
        }
        System.out.println("*************************");

        //2. Using Hashset Collection - which stores only unique element - Time Complexity : O(n)
        Set<String> store = new HashSet<String>();
        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("Duplicate element using hashset is:" + name);
            }
        }
        System.out.println("*************************");

        //3. Using HashMap - Time Complexity : O(2n)

        Map<String, Integer> storeMap = new HashMap<String, Integer>();
        for(String name : names){
            Integer count = storeMap.get(name);
            if(count==null){
                storeMap.put(name, 1);
            }else{
                if(storeMap.get(name)>=1){
                    System.out.println("Duplicate Element using Sumit Solution:"+ name);
                }
                storeMap.put(name,++count);
            }
        }
        System.out.println(storeMap);
        // retrieving values from Hashmap is via Set - entrySet
        Set<Map.Entry<String, Integer>> entrySet = storeMap.entrySet();

            for (Map.Entry<String, Integer> entry : entrySet) {
                if (entry.getValue()>1){
                    System.out.println("Duplicate Element using Hashmap:"+ entry.getKey());
                }

            }

    }

}
