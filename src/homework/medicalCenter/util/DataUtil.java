package homework.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static String registerDate(Date date) {
        return sdf.format(date);
    }

    public static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

    public static String dateToString(Date date) {
        return SDF.format(date);
    }

    public static Date stringToDate(String dateStr) throws ParseException {
        return SDF.parse(dateStr);
    }
    public static boolean isSameDay(Date date1, Date date2) {
        return dateToString(date1).equals(dateToString(date2));
    }
}
