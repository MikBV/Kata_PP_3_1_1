package org.example.kata_pp_3_1_1.Controller;

import org.example.kata_pp_3_1_1.Entity.User;
import org.example.kata_pp_3_1_1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("user/")
public class UserController {
    UserService userService;

    @Autowired
    public void userServiceBean(UserService userService){
        this.userService = userService;
    };
    
    @GetMapping("users")
    public String getAllUsers(Model model) {
        List<User> userList = userService.getAllUsers();
        model.addAttribute("users", userList);
        return "user/users";
    }

    @GetMapping("adduser")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user/adduser";
    }

    @PostMapping("adduser")
    public String addUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/user/users";
    }

    @GetMapping("changeuser")
    public String saveUser(@RequestParam int userId, Model model) {
        model.addAttribute("user", userService.getUserById(userId));
        return "user/changeuser";
    }

    @PostMapping("changeuser")
    public String saveUser(@ModelAttribute User user) {
        System.out.println(user);
        userService.changeUser(user);
        return "redirect:/user/users";
    }

    @GetMapping("deleteuser")
    public String deleteUser(@RequestParam int userId, Model model) {
        model.addAttribute("user", userService.getUserById(userId));
        return "user/deleteuser";
    }

    @PostMapping("deleteuser")
    public String deleteUser(@ModelAttribute User user) {
        System.out.println(user.toString());
        userService.deleteUser(user);
        return "redirect:/user/users";
    }

}