package kodlamaio.Devs.dataAccess.concretes;

import kodlamaio.Devs.dataAccess.abstracts.CompanyRepository;
import kodlamaio.Devs.entities.conceretes.Company;
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
    public void delete(Company company) {
        this.companyList = companyList.stream().filter(c -> c.getId() == company.getId()).toList();
    }

    @Override
    public void update(Company company) {
        int findIndex = companyList.indexOf(company);
        companyList.set(findIndex, company);
    }

    @Override
    public void add(Company company) {
        companyList.add(company);
    }

}
