package com.devops.coach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Howdy Folkss..I'm ANAS AZIACH");
        model.addAttribute("msg", "Helqwdqwdqqlo All..testWe are deploying springboot application into EKS cluster using Helm + Jenkins Pipeline!!!! Today is Aug 7th, 2023");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
