package com.tothenew.aws.api.controller;

import com.tothenew.aws.api.model.User;
import com.tothenew.aws.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return this.userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id") long userId) {
        return this.userService.findUserById(userId);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return this.userService.findAllUsers();
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") long userId) {
        return this.userService.updateUser(user, userId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") long userId) {
        this.userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }

}
