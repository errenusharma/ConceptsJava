package org.automation.java;

public class RegexUsage {
    public static void main(String[] args) {
        //1. Removing special or unwanted charcters using replaceAll method and regex

        String str = "@@!%%testing1234&++Java";
        String s1= str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1);
    }
}
