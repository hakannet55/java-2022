package kodlamaio.Devs.webApi.controllers;

import kodlamaio.Devs.business.abstracts.CompanyService;
import kodlamaio.Devs.entities.models.GenericResponse;
import kodlamaio.Devs.entities.conceretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/getAll")
    List<Company> getAll() {
        return this.companyService.getAll();
    }

    @GetMapping("/getById/{id}")
    Company getById(@PathVariable int id) {
        return this.companyService.getById(id);
    }

    @PostMapping("/update")
    List<Company> update(@RequestBody Company company) {
        this.companyService.update(company);
        return this.companyService.getAll();
    }

    @PostMapping("/add")
    List<Company> add(@RequestBody Company company) {
        this.companyService.add(company);
        return this.companyService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<GenericResponse> delete(@PathVariable int id) {
        Company company = new Company(id, null, null, null);
        try {
            return new ResponseEntity<GenericResponse>(this.companyService.delete(company), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<GenericResponse>(new GenericResponse(0), HttpStatus.EXPECTATION_FAILED);
        }
    }

}
