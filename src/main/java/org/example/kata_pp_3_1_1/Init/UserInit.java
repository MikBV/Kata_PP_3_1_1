package org.example.kata_pp_3_1_1.Init;

import org.example.kata_pp_3_1_1.Entity.User;
import org.example.kata_pp_3_1_1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInit {
    private UserService userService;

    @Autowired
    public UserInit(UserService userService) {
        userService.addUser(new User("123@x.com", "root", "Mike", "Bel", 12));
        userService.addUser(new User("wsss@4.com", "root", "eee", "ee", 22));

        this.userService = userService;
    }
}
