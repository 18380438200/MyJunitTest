package com.example.myjunittest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by apple on 18/2/9.
 */

public class DateUtil {
    public static String FORMATE_TIME = "yyyy-MM-dd HH:mm:ss";
    public static String FORMATE_DATE = "YYYY-MM-dd";

    public static long dateToTimestamp(String time){
        SimpleDateFormat sdf = new SimpleDateFormat(FORMATE_TIME);
        try {
            Date date = sdf.parse(time);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String timestampToDate(long timeStamp){
        SimpleDateFormat sdf = new SimpleDateFormat(FORMATE_TIME);
        Date date = new Date(timeStamp);
        return sdf.format(date);
    }
}
