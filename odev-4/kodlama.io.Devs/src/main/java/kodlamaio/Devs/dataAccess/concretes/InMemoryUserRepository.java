package kodlamaio.Devs.dataAccess.concretes;

import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.dataAccess.abstracts.UserRepository;
import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.conceretes.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // dataAcces nesnesidir
public class InMemoryUserRepository implements UserRepository {
    List<User> userData;

    public InMemoryUserRepository() {
        userData = new ArrayList<>();
        userData.add(new User(0, "Ahmet","Hakan"));
        userData.add(new User(1, "Mehmet","Türkoğlu"));
    }

    public List<User> getAll() {
        return userData;
    }

    @Override
    public void delete(User user) {

    }

    public void remove(Language language) {

    }
}
