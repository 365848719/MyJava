package com.scz.demo.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
    public static Date parse(Object o)
    {
        Date d = new Date();

        try {
           d =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(o.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return d;
    }
}
