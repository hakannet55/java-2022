package kodlamaio.Devs.webApi.controllers;

import kodlamaio.Devs.business.concretes.CompanyManager;
import kodlamaio.Devs.entities.conceretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    private final CompanyManager companyManager;

    @Autowired
    public CompanyController(CompanyManager companyManager) {
        this.companyManager = companyManager;
    }

    @GetMapping("/getAll")
    List<Company> getAll() {
        return this.companyManager.getAll();
    }

    @GetMapping("/getById/{id}")
    Company getById(int id) {
        List<Company> list = this.companyManager.getAll();
        return list.stream().filter(i -> i.getId() == id).findAny()
                .orElse(null);
    }

    @PutMapping("/update")
    List<Company> update(@RequestBody Company company) {
        this.companyManager.update(company);
        return this.companyManager.getAll();
    }

}
