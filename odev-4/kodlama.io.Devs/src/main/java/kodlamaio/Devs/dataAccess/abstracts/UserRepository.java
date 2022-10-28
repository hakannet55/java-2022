package kodlamaio.Devs.dataAccess.abstracts;

import kodlamaio.Devs.entities.conceretes.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    List<User> getAll();

    void delete(User user);

    void update(User user);

    void add(User user);
}
