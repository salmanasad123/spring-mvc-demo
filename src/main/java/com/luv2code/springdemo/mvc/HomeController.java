package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// this controller will be picked up during component scanning because @Controller inherits from @Component
// telling spring that this is our MVC controller
@Controller
public class HomeController {

    // define controller method
    // add a request mapping to our controller method
    // attach this "/" path to our method, it will handle all type of http requests for "/"
    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
    }
}
