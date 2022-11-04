package kodlamaio.Devs.webApi.controllers;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.business.requests.AddSubTechnologyRequest;
import kodlamaio.Devs.business.requests.LanguageAddRequest;
import kodlamaio.Devs.business.responses.LanguageResponse;
import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.models.OperationResult;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<LanguageResponse> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/getAll_v2")
    public List<LanguageResponse> getAllv2() {
        //LanguageResponse response = new LanguageResponse();
        //response.setDataList(languageService.getAll());
        //response.setResult(new OperationResult(null, "Success"));
        return languageService.getAll();
    }

    @PutMapping("/add")
    List<LanguageResponse> add(@RequestBody LanguageAddRequest language) {
        this.languageService.add(language);
        return this.languageService.getAll();
    }

    @GetMapping("/get/{id}")
    LanguageResponse getById(@PathVariable Integer id) {
        return this.languageService.getById(id);
    }

    @PostMapping("/update")
    public void update(@RequestBody Language language) {
        this.languageService.update(language);
    }


    @PostMapping("/addSubTechnology")
    public void update(@RequestBody AddSubTechnologyRequest addSubTechnologyRequest) {

        this.languageService.addSubTechnology(addSubTechnologyRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        this.languageService.delete(id);
    }
}
