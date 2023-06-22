package fr.vaitilingom.myApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.vaitilingom.myApi.model.User;
import fr.vaitilingom.myApi.service.UserService;

@RestController
public class UserController {
    
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/user")
    
    public User getUser(@RequestParam int id) {

    User user = userService.getUser(id);

        if (user != null) {
            return user;
        } else {
            return null;
        }

    }

    @PostMapping("/user")
    public User createUser(@RequestBody UserRequest body){

        User user = userService.createUser(body.getName(), body.getAge());
        return user;

    }
}
