package group1.Chapter7.String;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "first line";
        String strOb2 = "second line";
        String strOb3 = strOb1;
        System.out.println("length of line strOb1 : " + strOb1.length());
        System.out.println("symbol of index 3 : " + strOb1.charAt(3));
        if (strOb1.equals(strOb2)) {
            System.out.println("first line == second line");
        } else {
            System.out.println("first line != second line");
        }

        if (strOb1.equals(strOb3)) {
            System.out.println("strOb1 == strOb3");
        } else {
            System.out.println("strOb1 != strOb3");
        }
    }
}
