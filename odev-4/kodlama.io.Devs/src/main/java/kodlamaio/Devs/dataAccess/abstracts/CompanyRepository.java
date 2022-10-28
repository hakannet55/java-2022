package kodlamaio.Devs.dataAccess.abstracts;

import kodlamaio.Devs.entities.conceretes.Company;
import kodlamaio.Devs.entities.conceretes.User;

import java.util.List;

public interface CompanyRepository {
    List<Company> getAll();

    void delete(Company company);

    void update(Company company);

    void add(Company company);
}
