package me.oneqxz.b0mb3rrr.utils;

public class StringPosition {

    public static String center(String str, int spaces)
    {
        String space = " ".repeat((spaces-str.length())/2);
        return space + str + space;
    }

    public static String center(String str, String spaces)
    {
        return center(str, spaces.length());
    }

}
