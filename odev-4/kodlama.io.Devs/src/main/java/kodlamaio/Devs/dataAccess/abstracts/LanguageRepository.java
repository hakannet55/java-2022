package kodlamaio.Devs.dataAccess.abstracts;

import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.conceretes.User;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();

    void delete(User user);

    void update(User user);

    void add(User user);
}
