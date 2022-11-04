package kodlamaio.Devs.dataAccess.abstracts;

import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.conceretes.User;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();

    Language getById(int id);
    void delete(Language language);

    void update(Language language);

    void add(Language language);
}
