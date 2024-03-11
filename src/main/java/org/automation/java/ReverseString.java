package org.automation.java;

public class ReverseString {

    public static void main(String[] args) {

        ReverseString string = new ReverseString();

        System.out.println("Reversed String using basic string = " + reverseString("HelloWorld"));
        System.out.println("Reversed String using StringBuffer = " + string.reverseString2("Selenium"));
        System.out.println("Reversed String using StringBuilder = " + string.reverseString3("Java"));

    }

    // 1. Using no inherent method and basic string custom method using for loop and charAt method

    public static String reverseString(String str) {
        int len = str.length();
        String revStr = "";
        for (int i = len - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }

    //2. Using inherent reverse  method of StringBuffer class since it lets you create mutable objects

    public StringBuffer reverseString2(String str) {
        StringBuffer sf = new StringBuffer(str);
        StringBuffer revStr = sf.reverse();
        return revStr;
    }

    //3. Using inherent reverse  method of StringBuffer class since it lets you create mutable objects

    public StringBuilder reverseString3(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder revStr = sb.reverse();
        return revStr;
    }
}
