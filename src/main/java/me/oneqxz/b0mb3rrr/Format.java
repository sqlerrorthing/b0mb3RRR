package me.oneqxz.b0mb3rrr;

public class Format {

    public static String format(String phone, String mask, String maskSymbol) {
        if (phone.length() == countOccurrences(mask, maskSymbol)) {
            StringBuilder formattedPhone = new StringBuilder();
            for (int i = 0, j = 0; i < mask.length(); i++) {
                if (mask.charAt(i) == maskSymbol.charAt(0)) {
                    formattedPhone.append(phone.charAt(j));
                    j++;
                } else {
                    formattedPhone.append(mask.charAt(i));
                }
            }
            return formattedPhone.toString();
        } else {
            return phone;
        }
    }

    public static String format(String phone, String mask) {
        return format(phone, mask, "*");
    }

    public static int countOccurrences(String str, String sub) {
        return (str.length() - str.replace(sub, "").length()) / sub.length();
    }

}
