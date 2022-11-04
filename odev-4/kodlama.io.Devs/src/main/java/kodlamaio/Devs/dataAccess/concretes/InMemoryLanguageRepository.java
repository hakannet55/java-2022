package kodlamaio.Devs.dataAccess.concretes;

import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.entities.conceretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // dataAcces nesnesidir
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> itemList;

    public InMemoryLanguageRepository() {
        itemList = new ArrayList<>();
        String[] languageList = {"HTML", "C#", "C++", "PHP"};
        int index = 0;
        for (String subItem : languageList) {
            itemList.add(new Language(index, subItem));
            index++;
        }
    }

    public List<Language> getAll() {
        return this.itemList;
    }

    @Override
    public void delete(Language language) {
        this.itemList = this.itemList.stream().filter(c -> c.getId() != language.getId()).toList();
    }

    @Override
    public Language getById(int id) {
        return this.itemList.stream().filter(c -> c.getId() == id).toList().get(0);
    }

    @Override
    public void update(Language language) {
        int index = 0;
        boolean updated = false;
        for (Language c : this.itemList) {
            if (!updated && c.getId() == language.getId()) {
                this.itemList.set(index, language);
                updated = true;
            }
            index++;
        }
    }

    @Override
    public void add(Language language) {
        this.itemList.add(language);
    }
}
