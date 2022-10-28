package kodlamaio.Devs.business.concretes;

import kodlamaio.Devs.business.abstracts.CompanyService;
import kodlamaio.Devs.dataAccess.concretes.InMemoryCompanyRepository;
import kodlamaio.Devs.entities.GenericResponse;
import kodlamaio.Devs.entities.conceretes.Company;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {
    InMemoryCompanyRepository inMemoryCompanyRepository;

    public CompanyManager(InMemoryCompanyRepository inMemoryCompanyRepository) {
        this.inMemoryCompanyRepository = inMemoryCompanyRepository;
    }

    @Override
    public List<Company> getAll() {
        return this.inMemoryCompanyRepository.getAll();
    }

    @Override
    public GenericResponse add(Company company) {
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse update(Company company) {
        this.inMemoryCompanyRepository.update(company);
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse delete(Company company) {
        return new GenericResponse(200);
    }
}
