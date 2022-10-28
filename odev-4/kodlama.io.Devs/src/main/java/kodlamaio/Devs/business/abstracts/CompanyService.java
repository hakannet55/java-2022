package kodlamaio.Devs.business.abstracts;

import kodlamaio.Devs.entities.GenericResponse;
import kodlamaio.Devs.entities.conceretes.Company;
import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.conceretes.User;

import java.util.List;

public interface CompanyService {
    List<Company> getAll();

    GenericResponse add(Company company);

    GenericResponse update(Company company);

    GenericResponse delete(Company company);
}
