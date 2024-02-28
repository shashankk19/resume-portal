package io.personalproject.resumeportal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public String Home(){
        return "Hello Shashank";
    }

    @GetMapping("/view/{userId}")
    public String view(@PathVariable String userId,Model model){
        model.addAttribute("userId",userId);
        return "profile";
    }
}
