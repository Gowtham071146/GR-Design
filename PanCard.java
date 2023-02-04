import java.util.regex.*;

class PanCard {
    public static boolean isValidPanCardNo(String panCardNo) {
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

        Pattern p = Pattern.compile(regex);

        if (panCardNo == null) {
            return false;
        }

        Matcher m = p.matcher(panCardNo);
        return m.matches();
    }

    public static void main(String args[]) {

        String str1 = "BNZAA2318J";
        System.out.println(isValidPanCardNo(str1));

        String str2 = "23ZAABN18J";
        System.out.println(isValidPanCardNo(str2));

        String str3 = "BNZAA2318JM";
        System.out.println(isValidPanCardNo(str3));

        String str4 = "BNZAA23184";
        System.out.println(isValidPanCardNo(str4));

        String str5 = "BNZAA 23184";
        System.out.println(isValidPanCardNo(str5));
    }
}
