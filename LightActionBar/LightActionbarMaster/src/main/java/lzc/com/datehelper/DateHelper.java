package lzc.com.datehelper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lzc on 2017/7/24.
 */

public class DateHelper {
    private static Date date;
    private static SimpleDateFormat sdf;


    public static String formatDate(String formate){
        date = new Date();
        sdf = new SimpleDateFormat(formate);
        return sdf.format(date);
    }
    public static String formateDate(){
        date = new Date();
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
}
