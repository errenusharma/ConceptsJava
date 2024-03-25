package org.automation.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestDuplicateElements {

    @Test
    public void testDuplicateElements()
    {
        String str = "SeleniumTesting";
        ReverseString string = new ReverseString();

        System.out.println("Reversed String using basic string = " + ReverseString.reverseString(str));
        System.out.println("Reversed String using StringBuffer = " + string.reverseString2(str));
        System.out.println("Reversed String using StringBuilder = " + string.reverseString3("Java"));
        //StringBuilder result = string.reverseString3("Java");
        Assertions.assertEquals("avaJ",string.reverseString3("Java"));

    }

}:::





:::
+``