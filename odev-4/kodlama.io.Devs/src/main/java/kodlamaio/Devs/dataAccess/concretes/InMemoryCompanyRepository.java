package kodlamaio.Devs.dataAccess.concretes;

import kodlamaio.Devs.dataAccess.abstracts.CompanyRepository;
import kodlamaio.Devs.entities.conceretes.Company;
import kodlamaio.Devs.entities.conceretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // dataAcces nesnesidir
public class InMemoryCompanyRepository implements CompanyRepository {
    private List<Company> companyList;

    public InMemoryCompanyRepository() {
        this.companyList = new ArrayList<>();
        companyList.add(new Company(0, "TürkTelekom", null, null));
        companyList.add(new Company(1, "Türkcell", null, null));
    }

    @Override
    public List<Company> getAll() {
        return this.companyList;
    }

    @Override
    public Company getById(int id) {
          return this.companyList.stream().filter(c -> c.getId() == id).toList().get(0);
    }

    @Override
    public void delete(Company company) {
        this.companyList = companyList.stream().filter(c -> c.getId() != company.getId()).toList();
    }

    @Override
    public void update(Company company) {
        int index = 0;
        for (Company c : companyList) {
            if (c.getId() == company.getId()) {
                companyList.set(index, company);
            }
            index++;
        }
    }

    @Override
    public void add(Company company) {
        companyList.add(company);
    }

}
