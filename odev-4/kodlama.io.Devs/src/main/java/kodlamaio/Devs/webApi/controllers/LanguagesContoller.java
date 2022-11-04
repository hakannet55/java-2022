package kodlamaio.Devs.webApi.controllers;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.entities.models.GenericResponse;
import kodlamaio.Devs.entities.models.OperationResult;
import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.conceretes.LanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/languages")
public class LanguagesContoller {
    private final LanguageService languageService;

    @Autowired
    public LanguagesContoller(LanguageService languageService) {
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

    @PutMapping("/add")
    List<Language> add(@RequestBody Language language) {
        this.languageService.add(language);
        return this.languageService.getAll();
    }

    @GetMapping("/getById/{id}")
    Language getById(@PathVariable int id) {
        List<Language> list = this.languageService.getAll();
        return list.stream().filter(i -> i.getId() == id).findAny()
                .orElse(null);
    }

    @PostMapping("/update")
    public GenericResponse update(@RequestBody Language language) {
         this.languageService.update(language);
        return new GenericResponse(200);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<GenericResponse> delete(@PathVariable int id) {
        Language language = new Language(id, null);
        try {
            return new ResponseEntity<GenericResponse>(this.languageService.delete(language), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<GenericResponse>(new GenericResponse(0), HttpStatus.EXPECTATION_FAILED);
        }
    }
}
