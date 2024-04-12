package org.automation.java;

public class SubstringSwap {

    public void swapStrings(String first, String second) {

        StringBuilder sb=new StringBuilder(first);
        sb.append(second);//HelloWorld

        second=sb.substring(0,first.length());
        first=sb.substring(second.length());

        System.out.println("First String is :"+first);
        System.out.println("Second String is: "+second);

    }
}

