package org.automation.java;

public class ReverseString {


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

    //3. Using inherent reverse  method of StringBuilder class since it lets you create mutable objects

    public String reverseString3(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder revStr = sb.reverse();
        return revStr.toString(); // converting StringBuilder back to String
    }
}
