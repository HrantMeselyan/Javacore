package homework.employee.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static final SimpleDateFormat sdfRegister = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    public static final SimpleDateFormat sdfBirthday = new SimpleDateFormat("dd/MM/yyyy");

    public static String registerDate(Date date) {
        return sdfRegister.format(date);
    }

    public static String dateOfBirthday(Date date) {
        return sdfBirthday.format(date);
    }

    public static Date stringToDate(String dateStr) throws ParseException {
        if (dateStr == null) {
            return null;
        }
        return sdf.parse(dateStr);
    }
}
