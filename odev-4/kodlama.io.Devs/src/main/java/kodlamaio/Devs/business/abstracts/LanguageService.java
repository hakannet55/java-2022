package kodlamaio.Devs.business.abstracts;

import kodlamaio.Devs.entities.GenericResponse;
import kodlamaio.Devs.entities.conceretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();

    GenericResponse add(Language language);

    GenericResponse update(Language language);

    GenericResponse delete(Language language);

}
