package com.example.demo.utils;

public class Utils {
    public static String getHtmlHead(String innerHtml) {
        String head = "<head>" + new StyleCSS().get() + "</head>";
        return "<html>" + head + "<body>" + innerHtml + "</body</html>";
    }

    public static String getElement(String element, String text) {
        return "<" + element + ">" + text + "</" + element + ">";
    }

    public static String getElement(String element, String text, String attr) {
        return "<" + element + " " + attr + ">" + text + "</" + element + ">";
    }
}
