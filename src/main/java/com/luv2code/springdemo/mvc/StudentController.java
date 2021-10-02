package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")  // request mapping for controller so our route will begin from /student
public class StudentController {

    // the method will take Model as an attribute, because model is used to pass data between
    // view and controller, so controller can set something on the model and then view can get that
    // data which controller has set from the same model object
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // create a new student object
        Student theStudent = new Student();
        // add that student object to the model
        // model object will be referred in the view using the "student" key we have set here
        theModel.addAttribute("student", theStudent);
        return "student-form";
    }

    //  behind the scenes our Student object called theStudent will be populated with the form data
    // that view has set in the "student" model. So view used the same key "student" to set the data
    // and we use the same key to retrieve the data into our controller, so there is no need for us
    // to do request.getParam etc.
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName());
        System.out.println("theStudent: " + theStudent.getLastName());
        return "student-confirmation";
    }
}
