package org.example.kata_pp_3_1_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping({"index", "/"})
    public String index() {
        return "index";
    }
}
