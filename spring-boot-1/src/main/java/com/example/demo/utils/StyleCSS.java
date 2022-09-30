package com.example.demo.utils;

import jdk.jshell.execution.Util;

public class StyleCSS {
    BaseCSS[] css = {
            new BaseCSS("body","padding: 0px;margin: 0px"),
            new BaseCSS("body > h4","background: lightgoldenrodyellow;padding: 10px;"),
            new BaseCSS("a", "color:blue;padding:10px;margin:2px;background:lightgrey;cursor:pointer"),
            new BaseCSS("a:hover", "background:blue;")
    };

    public String get() {
        String result = "";
        for (BaseCSS item : this.css) {
            result += item.name + '{' + item.detay + '}';
        }
        return Utils.getElement("style", result);
    }
}
