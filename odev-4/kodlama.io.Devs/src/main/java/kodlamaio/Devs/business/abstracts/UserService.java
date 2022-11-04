package kodlamaio.Devs.business.abstracts;

import kodlamaio.Devs.entities.models.GenericResponse;
import kodlamaio.Devs.entities.conceretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(int id) throws Exception;

    GenericResponse add(User user) throws Exception;

    GenericResponse update(User user);

    GenericResponse delete(User user);
}
