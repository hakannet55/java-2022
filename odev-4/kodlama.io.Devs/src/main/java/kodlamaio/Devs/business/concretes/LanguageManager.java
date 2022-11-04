package kodlamaio.Devs.business.concretes;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.entities.models.GenericResponse;
import kodlamaio.Devs.entities.conceretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Business nesnesidir
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        // iş kuralları
        return this.languageRepository.getAll();
    }

    @Override
    public Language getById(int id) {
        return this.languageRepository.getById(id);
    }

    @Override
    public GenericResponse add(Language language) {
        this.languageRepository.add(language);
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse update(Language language) {
        this.languageRepository.update(language);
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse delete(Language language) {
        this.languageRepository.delete(language);
        return new GenericResponse(200);
    }
}
