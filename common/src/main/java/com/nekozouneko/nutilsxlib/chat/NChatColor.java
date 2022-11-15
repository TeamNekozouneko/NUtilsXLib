package com.nekozouneko.nutilsxlib.chat;

public class NChatColor {

    private static final char COLOR_PREFIX = '\u00A7';

    public static final String BLACK = COLOR_PREFIX + "0";
    public static final String DARK_BLUE = COLOR_PREFIX + "1";
    public static final String DARK_GREEN = COLOR_PREFIX + "2";
    public static final String DARK_AQUA = COLOR_PREFIX + "3";
    public static final String DARK_RED = COLOR_PREFIX + "4";
    public static final String DARK_PURPLE = COLOR_PREFIX + "5";
    public static final String GOLD = COLOR_PREFIX + "6";
    public static final String GRAY = COLOR_PREFIX + "7";
    public static final String DARK_GRAY = COLOR_PREFIX + "8";
    public static final String BLUE = COLOR_PREFIX + "9";
    public static final String GREEN = COLOR_PREFIX + "a";
    public static final String AQUA = COLOR_PREFIX + "b";
    public static final String RED = COLOR_PREFIX + "c";
    public static final String LIGHT_PURPLE = COLOR_PREFIX + "d";
    public static final String YELLOW = COLOR_PREFIX + "e";
    public static final String WHITE = COLOR_PREFIX + "f";

    public static final String OBFUSCATED = COLOR_PREFIX + "k";
    public static final String BOLD = COLOR_PREFIX + "l";
    public static final String STRIKETHROUGH = COLOR_PREFIX + "m";
    public static final String UNDERLINED = COLOR_PREFIX + "n";
    public static final String ITALIC = COLOR_PREFIX + "o";
    public static final String RESET = COLOR_PREFIX + "r";

    private NChatColor() {}

    public static String colorFromWebColor(char altWebColorChar, String s) {
        return s.replaceAll(altWebColorChar + "([0-9A-Fa-f])([0-9A-Fa-f])([0-9A-Fa-f])([0-9A-Fa-f])([0-9A-Fa-f])([0-9A-Fa-f])", "§x§$1§$2§$3§$4§$5§$6")
                .replaceAll(altWebColorChar + "([0-9A-Fa-f])([0-9A-Fa-f])([0-9A-Fa-f])", "§x§$1§$2§$3");
    }

    public static String colorFromWebColor(String s) {
        return colorFromWebColor('#', s);
    }

    public static String replaceAltColorCodes(char altColorCode, String s) {
        return s.replaceAll(altColorCode + "([0-9A-Fa-fRrK-Ok-oXx])", "§$1");
    }

    public static String replaceAltColorCodes(String s) {
        return replaceAltColorCodes('&', s);
    }

}
