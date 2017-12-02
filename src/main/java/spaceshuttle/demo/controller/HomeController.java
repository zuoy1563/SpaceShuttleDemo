package spaceshuttle.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/home")
public class HomeController {
    @GetMapping(path = "/index")
    public String index() {
        return "index";
    }

    @GetMapping(path = "/my")
    public String my() {
        return "my";
    }

}
