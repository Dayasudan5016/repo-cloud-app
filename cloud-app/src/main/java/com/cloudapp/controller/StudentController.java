package com.cloudapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cloudapp.vo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

 

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        // create a student object
        Student theStudent=new Student();
        // add student object to the model
        model.addAttribute("student",theStudent);
         // add the country options to the model 
    
        return "student-form";
    }
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        // log the input data
        System.out.println("theStudent: "+theStudent.getFirstName()+" "+theStudent.getLastName());
        return "student-confirmation";
    }
}