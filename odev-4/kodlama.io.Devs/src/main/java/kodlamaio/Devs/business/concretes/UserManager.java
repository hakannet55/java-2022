package kodlamaio.Devs.business.concretes;

import kodlamaio.Devs.business.RuleEngineService;
import kodlamaio.Devs.business.abstracts.UserService;
import kodlamaio.Devs.dataAccess.inmemory.InMemoryUserRepository;
import kodlamaio.Devs.entities.RuleTypesEnum;
import kodlamaio.Devs.entities.conceretes.User;
import kodlamaio.Devs.entities.models.GenericResponse;
import kodlamaio.Devs.entities.models.RuleEngineData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.ObjectUtils.anyNull;

@Service
public class UserManager implements UserService {

    public InMemoryUserRepository userRepository;

    public UserManager(InMemoryUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return this.userRepository.getAll();
    }

    @Override
    public User getById(int id) throws Exception {
        List<RuleEngineData> ruleList = new ArrayList<>();
        ruleList.add(new RuleEngineData("Girilen Data Numara Değildir", RuleTypesEnum.INT));
        ruleList.add(new RuleEngineData("Boş olamaz.", RuleTypesEnum.BLANK));

        RuleEngineService ruleEngineService = new RuleEngineService(ruleList);
        String message = ruleEngineService.startControl(null, id);
        if (message.isEmpty()) {
            return this.userRepository.getById(id);
        } else {
            throw new Exception(message);
        }
    }

    @Override
    public GenericResponse add(User user) throws Exception {
        List<RuleEngineData> ruleList = new ArrayList<>();
        ruleList.add(new RuleEngineData("Girilen Data Numara Değildir", RuleTypesEnum.INT));
        ruleList.add(new RuleEngineData("Boş olamaz.", RuleTypesEnum.BLANK));
        String[] keys = {"id"};
        RuleEngineService ruleEngineService = new RuleEngineService(ruleList);

        String message = ""; //ruleEngineService.startControl(keys,user);
        if (anyNull(user)) {
            message = "Boş alan olamaz=>";
        }
        if (user.getName() == null) {
            //message = message + "Name";
        }
        if (user.getLastName() == null) {
            //message = message + " LastName";
        }
        if (Integer.valueOf(user.getId()) < 0) {
            //message.concat(" id");
        }
        if (message.isEmpty()) {
            userRepository.add(user);
            return new GenericResponse(200);
        } else {
            throw new Exception(message);
        }

    }

    @Override
    public GenericResponse update(User user) {
        userRepository.update(user);
        return new GenericResponse(200);
    }

    @Override
    public GenericResponse delete(User user) {
        if (user == null) {
            throw new Error("Error-null");
        }
        this.userRepository.delete(user);
        return new GenericResponse(200);
    }
}
