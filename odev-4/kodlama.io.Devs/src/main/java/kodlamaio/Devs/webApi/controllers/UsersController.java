package kodlamaio.Devs.webApi.controllers;

import kodlamaio.Devs.business.abstracts.UserService;
import kodlamaio.Devs.business.concretes.UserManager;
import kodlamaio.Devs.entities.conceretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserManager userManager) {
        this.userService = userManager;
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        return this.userService.getAll();
    }

    @PostMapping("/update")
    public User update(@RequestBody User user) {
        return user;
    }

    @PostMapping("/add")
    public List<User> add(@RequestBody User user) throws Exception {
        userService.add(user);
        return userService.getAll();
    }

    @GetMapping("/getById/{id}")
    User getById(@PathVariable int id) {
        List<User> list = this.userService.getAll();
        return list.stream().filter(i -> i.getId() == id).findAny()
                .orElse(null);
    }

    @PostMapping("/delete/{id}")
    public List<User> delete(@PathVariable int id) {
        User user = new User(id, null, null);
        this.userService.delete(user);
        return this.userService.getAll();
    }

}
