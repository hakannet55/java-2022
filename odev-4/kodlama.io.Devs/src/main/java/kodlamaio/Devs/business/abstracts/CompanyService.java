package kodlamaio.Devs.business.abstracts;

import kodlamaio.Devs.entities.models.GenericResponse;
import kodlamaio.Devs.entities.conceretes.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAll();

    Company getById(int id);

    GenericResponse add(Company company);

    GenericResponse update(Company company);

    GenericResponse delete(Company company);
}
