package com.example.demo.api;

import com.example.demo.model.Ders;
import com.example.demo.model.Student;
import com.example.demo.model.User;
import com.example.demo.model.UserCreateDTO;
import com.example.demo.service.DersService;
import com.example.demo.service.StudentService;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/api")
public class UserAPI {

    private final UserService userService;
    private final DersService dersService;
    private final StudentService studentService;

    UserAPI(UserService userService, StudentService studentService, DersService dersService) {
        this.userService = userService;
        this.studentService = studentService;
        this.dersService = dersService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("v1/product/12")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        final User user = this.userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("v1/products")
    public ResponseEntity<List<User>> getUserList() {
        return ResponseEntity.ok(this.userService.getUserList());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("v1/dersler")
    public ResponseEntity<List<Ders>> getDersList() {
        return ResponseEntity.ok(this.dersService.getUserList());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("v1/initDataBase")
    public ResponseEntity<?> initDataBase() {
        List<User> list = this.userService.getUserList();
        List<Ders> ders = this.dersService.getUserList();

        if (list.toArray().length == 0) {
            // random generate names users
            Integer countUser = 2;
            Integer countStudent = 15;
            List<String> names = Arrays.asList("Hakan", "Ahmet", "Zafer", "Duru", "Tokgoz", "Melis", "Zehra", "Tuba", "Duygu", "Dagci", "Kurtulus");
            List<String> snf = Arrays.asList("12", "10", "11", "9");
            userService.createUser(new UserCreateDTO(getRandom(names), getRandom(names), "1"));
            for (Integer i = 0; i < countUser; i++) {
                userService.createUser(new UserCreateDTO(getRandom(names), getRandom(names), "0"));
            }
            for (Integer i = 0; i < countStudent; i++) {
                studentService.createUser(new Student(getRandom(names), getRandom(names), getRandom(snf)));
            }
        }
        if(ders.toArray().length == 0){
            dersService.createUser(new Ders("Türkçe", "trk", ""));
            dersService.createUser(new Ders("Matematik", "mat", ""));
        }
        return ResponseEntity.ok(new GenericResponse("initialized DB"));
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("v1/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok(new GenericResponse("User Deleted !"));
    }

    @CrossOrigin(origins = "*")
    @PostMapping("v1/user")
    public ResponseEntity<?> createUser(@RequestBody UserCreateDTO userCreateDTO) {
        userService.createUser(userCreateDTO);
        return ResponseEntity.ok(new GenericResponse("User Created."));
    }

    @CrossOrigin(origins = "*")
    @PutMapping("v1/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id,
                                           @RequestBody User userCreateDTO) {
        final User user = userService.updateUser(id, userCreateDTO);
        return ResponseEntity.ok(user);
    }

    public String getRandom(List<String> list) {
        Integer index = ThreadLocalRandom.current().nextInt(list.toArray().length) % list.size();
        return list.get(index);
    }


    @CrossOrigin(origins = "*")
    @GetMapping("v1/student")
    public ResponseEntity<List<Student>> getStudent() {
        return ResponseEntity.ok(this.studentService.getUserList());
    }

    @CrossOrigin(origins = "*")
    @PostMapping("v1/student")
    public ResponseEntity<?> createstudentUser(@RequestBody Student userCreateDTO) {
        studentService.createUser(userCreateDTO);
        return ResponseEntity.ok(new GenericResponse("User Created."));
    }

    @CrossOrigin(origins = "*")
    @PutMapping("v1/student/{id}")
    public ResponseEntity<Student> updateStudentUser(@PathVariable("id") Long id,
                                                     @RequestBody Student userCreateDTO) {
        final Student user = studentService.updateUser(id, userCreateDTO);
        return ResponseEntity.ok(user);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("v1/student/{id}")
    public ResponseEntity<?> deleteStudentUser(@PathVariable("id") Long id) {
        studentService.deleteUser(id);
        return ResponseEntity.ok(new GenericResponse("User Deleted !"));
    }
}
