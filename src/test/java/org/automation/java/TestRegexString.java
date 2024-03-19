package org.automation.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRegexString {


    @Test
    public void testRemoveSpecialChar_success(){
        RegexUsage regexUsage=new RegexUsage();

        String input="@@!%%Renu&++Java";

        String result = regexUsage.removeSpecialChar(input);

        Assertions.assertEquals("RenuJava",result);
    }
}
