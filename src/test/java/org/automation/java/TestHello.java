package org.automation.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHello {

    @Test
    public void testHello(){
        Assertions.assertTrue(Boolean.TRUE);
    }

    @Test
    public void testRemoveSpecialChar_success(){
        RegexUsage regexUsage=new RegexUsage();

        String input="@@!%%Renu&++Java";

        String result = regexUsage.removeSpecialChar(input);

        Assertions.assertEquals("Renu1Java",result);
    }
}
