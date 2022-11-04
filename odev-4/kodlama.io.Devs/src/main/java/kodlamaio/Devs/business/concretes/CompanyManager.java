package kodlamaio.Devs.business.concretes;

import kodlamaio.Devs.business.abstracts.CompanyService;
import kodlamaio.Devs.dataAccess.inmemory.InMemoryCompanyRepository;
import kodlamaio.Devs.entities.models.GenericResponse;
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
    public Company getById(int id) {
        return this.inMemoryCompanyRepository.getById(id);
    }

    @Override
    public GenericResponse add(Company company) {
        this.inMemoryCompanyRepository.add(company);
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse update(Company company) {
        this.inMemoryCompanyRepository.update(company);
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse delete(Company company) {
        if (company == null) {
            throw new Error("Error-null");
        }
        this.inMemoryCompanyRepository.delete(company);
        return new GenericResponse(200);
    }
}
