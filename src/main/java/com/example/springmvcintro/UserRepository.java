package com.example.springmvcintro;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserRepository {

    List<User> users = new ArrayList<>();

    private User user;

    public UserRepository(){
        users.add(new User("Jan", "Kowalski", 15));
        users.add(new User("Ada", "Nowak", 21));
        users.add(new User("Piotr", "Kowalczyk", 18));

    }

    @GetMapping("/users")
    @ResponseBody
    public String users() {

        return users.toString();
    }

    @RequestMapping("/add")
    @ResponseBody
    public String parameters(@RequestParam String firstName,
                           @RequestParam String lastName,
                           @RequestParam Integer age) {

        User user = new User(firstName, lastName, age);
        users.add(user);

        return "dodano!";

    }
}
