package homework.employee.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public static final  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static String registerDate(Date date) {
        SimpleDateFormat sdfReg = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdfReg.format(date);
    }

    public static String dateOfBirthday(Date date) {
        SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyyy");
        return sdfBirth.format(date);
    }
    public static Date stringToDate(String dateStr) throws ParseException {
        if (dateStr == null){
            return null;
        }
        return sdf.parse(dateStr);
    }
}
