package kodlamaio.Devs.business.concretes;

import kodlamaio.Devs.business.abstracts.UserService;
import kodlamaio.Devs.dataAccess.abstracts.UserRepository;
import kodlamaio.Devs.entities.GenericResponse;
import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.conceretes.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    public UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return this.userRepository.getAll();
    }

    @Override
    public GenericResponse add(Language language) {
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse update(Language language) {
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse delete(Language language) {
        return new GenericResponse(200);
    }
}
