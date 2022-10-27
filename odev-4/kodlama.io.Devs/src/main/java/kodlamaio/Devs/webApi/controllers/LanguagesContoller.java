package kodlamaio.Devs.webApi.controllers;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.entities.OperationResult;
import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.conceretes.LanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/languages")
public class LanguagesContoller {
    private final LanguageService languageService;

    @Autowired
    public LanguagesContoller(kodlamaio.Devs.business.abstracts.LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<Language> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/getAll_v2")
    public List<Language> getAllv2() {
        LanguageResponse response = new LanguageResponse();
        response.setDataList(languageService.getAll());
        response.setResult(new OperationResult(null, "Success"));
        return languageService.getAll();
    }

    @PutMapping("/update")
    public Language update(@RequestBody Language language){
        return language;
    }

    @DeleteMapping("/delete")
    public Language delete(@RequestBody Language language){
        return language;
    }
}
