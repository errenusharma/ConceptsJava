package org.automation.java;


import org.junit.jupiter.api.Test;

import java.util.Date;

public class TestDate {
    @Test
    public void testDateCurrent(){
        DateFormat df= new DateFormat();
        df.currentDate();
    }

    @Test
    public void testFormattedDate()
    {
        DateFormat df= new DateFormat();
        df.formattedDate(new Date());
    }
}
