package hello.hellospring.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    Logger logger;

    @GetMapping("hello")
    public String hello(Model model){
        int i = 10;
        System.out.println(i);
        model.addAttribute("data", "hello~!");
        return "hello";
    };

    @GetMapping("hello2")
    public String hello2(Model model){
        int i = 123;
        System.out.println(i);
        model.addAttribute("data", "hello22222~!");
        return "/folder1/hello2";
    };
}
