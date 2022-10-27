package kodlamaio.Devs.dataAccess.abstracts;

import kodlamaio.Devs.entities.conceretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();

    void remove(Language language);
}
