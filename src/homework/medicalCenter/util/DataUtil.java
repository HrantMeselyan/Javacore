package homework.medicalCenter.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
   private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
   public static String registerDate(Date date) {
      return sdf.format(date);
   }
}
