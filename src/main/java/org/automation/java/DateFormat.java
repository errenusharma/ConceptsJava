package org.automation.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.*;

public class DateFormat {
    public void currentDate()
    {
        Date d = new Date();
        System.out.println(d.toString()); // to convert date object to readable format

    }

    public void formattedDate(Date dNow)
    {
         SimpleDateFormat ft =
                new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); // change the format base on requirement

        System.out.println("Current Date: " + ft.format(dNow));
    }

}
