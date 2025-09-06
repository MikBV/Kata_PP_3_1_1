package org.example.kata_pp_3_1_1.Init;

import org.example.kata_pp_3_1_1.Entity.User;
import org.example.kata_pp_3_1_1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Init class for first user
 */
@Component
public class InitUser {
    private final UserService userService;
    private User user;

    @Autowired
    InitUser(UserService userService) {
        this.userService = userService;
        user = new User("bbb@gmail.com", "root", "aaa", "bbb",34);
        userService.addUser(user);
    }


}
