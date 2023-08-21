package com.gl.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.springMvc.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	//get the data into the model
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}

	//show the data in the model
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("The Student : "+theStudent.getFirstName());		
		return "student-confirmation";
	}
}
