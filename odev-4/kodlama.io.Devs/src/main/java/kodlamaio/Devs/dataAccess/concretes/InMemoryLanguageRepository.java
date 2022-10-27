package kodlamaio.Devs.dataAccess.concretes;

import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.entities.conceretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // dataAcces nesnesidir
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> brandsData;

    public InMemoryLanguageRepository() {
        brandsData = new ArrayList<>();
        String[] languageList = {"HTML", "C#", "C++", "PHP"};
        int index = 0;
        for (String i : languageList) {
            brandsData.add(new Language(index, "HTML"));
            index++;
        }
    }

    public List<Language> getAll() {
        return brandsData;
    }

    public void remove(Language language) {

    }
}
