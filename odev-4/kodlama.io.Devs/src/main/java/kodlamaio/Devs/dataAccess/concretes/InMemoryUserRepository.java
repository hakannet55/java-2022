package kodlamaio.Devs.dataAccess.concretes;

import kodlamaio.Devs.dataAccess.abstracts.UserRepository;
import kodlamaio.Devs.entities.conceretes.Company;
import kodlamaio.Devs.entities.conceretes.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // dataAcces nesnesidir
public class InMemoryUserRepository implements UserRepository {
    List<User> itemList;

    public InMemoryUserRepository() {
        itemList = new ArrayList<>();
        itemList.add(new User(0, "Ahmet", "Hakan"));
        itemList.add(new User(1, "Mehmet", "Türkoğlu"));
    }

    public List<User> getAll() {
        return this.itemList;
    }

    @Override
    public User getById(int id) {
        return this.itemList.stream().filter(c -> c.getId() == id).toList().get(0);
    }

    @Override
    public void delete(User user) {
        this.itemList = this.itemList.stream().filter(c -> c.getId() != user.getId()).toList();
    }

    @Override
    public void update(User user) {
        int index = 0;
        for (User c : this.itemList) {
            if (c.getId() == user.getId()) {
                this.itemList.set(index, user);
            }
            index++;
        }
    }

    @Override
    public void add(User user) {
        this.itemList.add(user);
    }

}
