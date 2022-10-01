package com.example.demo.api;

import com.example.demo.model.User;
import com.example.demo.utils.Utils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class MainPage {
    @CrossOrigin(origins = "*")
    @GetMapping("")
    public String getMainPage() {
        Utils util = new Utils();
        String innerHtml = util.getElement("h4", "Ürünler");

        String kategoriler[] = {"Ayakkabı", "Elbise", "Parfüm", "Takı"};
        String list = "";
        for (String item : kategoriler) {
            list += util.getElement("a", item, "onclick='clickBtn(this)'");
        }
        innerHtml += list;
        String script = util.getElement("script", "function clickBtn(t){alert(t);}");
        return util.getHtmlHead(innerHtml) + script;
    }
}
