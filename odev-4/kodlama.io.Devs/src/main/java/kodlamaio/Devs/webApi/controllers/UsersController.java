package kodlamaio.Devs.webApi.controllers;

import kodlamaio.Devs.business.concretes.UserManager;
import kodlamaio.Devs.entities.conceretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {
    private final UserManager userManager;

    @Autowired
    public UsersController(UserManager userManager){
        this.userManager = userManager;
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return this.userManager.getAll();
    }

    @PutMapping("/update")
    public User update(@RequestBody User user){
        return user;
    }

    @DeleteMapping("/delete")
    public User delete(@RequestBody User user){
        return user;
    }

}
