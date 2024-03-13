package org.automation.java;

public class RegexUsage {
    public String removeSpecialChar(String str) {
        //1. Removing special or unwanted characters using replaceAll method and regex
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }
}
