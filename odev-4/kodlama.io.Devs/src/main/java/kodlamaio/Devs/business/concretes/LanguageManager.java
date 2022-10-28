package kodlamaio.Devs.business.concretes;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.entities.GenericResponse;
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
        return languageRepository.getAll();
    }

    @Override
    public GenericResponse add(Language language) {
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse update(Language language) {
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse delete(Language language) {
        return new GenericResponse(200);
    }
}
