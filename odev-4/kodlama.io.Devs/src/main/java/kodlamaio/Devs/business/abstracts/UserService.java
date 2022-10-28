package kodlamaio.Devs.business.abstracts;

import kodlamaio.Devs.entities.GenericResponse;
import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.conceretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    GenericResponse add(Language language);

    GenericResponse update(Language language);

    GenericResponse delete(Language language);
}
