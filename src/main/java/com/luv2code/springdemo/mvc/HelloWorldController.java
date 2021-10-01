package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // need a controller method to show the initial form
    @RequestMapping("/showForm")
    public String displayForm() {
        return "helloworld-form";
    }

    // need a controller method to process the form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // add a new controller method to read form data
    // add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read form data from HTML form in the controller method, studentName is the name of form field
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add the data to the model
        model.addAttribute("message", result);

        return "helloworld";  // return name of the view
    }

    // reading html form field named studentName and setting/binding its value to variable theName using
    // @RequestParam attribute
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Hey my friend " + theName;

        // add the data to the model
        model.addAttribute("message", result);

        return "helloworld";  // return name of the view
    }
}
