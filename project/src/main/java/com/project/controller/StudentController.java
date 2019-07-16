package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Question;
import com.project.model.Student;
import com.project.service.StudentService;

@Controller
@SessionAttributes("studentName")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/checkInfo",method = RequestMethod.POST)
	public ModelAndView checkInfo(@RequestParam("username")String username,@RequestParam("password")String password) {
		ModelAndView modelview = null;
		if(studentService.checkStudentRegister(username, password)) {
			modelview = new ModelAndView("dashboardStudent");
            modelview.addObject("studentName", username);
		}else {
			if(studentService.checkIfUseridPresent(username, password) == 0) {
				modelview = new ModelAndView("wrongInfo");
			}
			
			if(studentService.checkIfUseridPresent(username, password) == -1) {
				modelview = new ModelAndView("registerStudent");
			}
		}
		
		return modelview;
	}
	
	
	@RequestMapping("/dashboardStudent")
	public ModelAndView dashboardPageStudent() {
		ModelAndView model = new ModelAndView("dashboardStudent");
		return model;
	}
	
	@RequestMapping("/error")
	public ModelAndView errorPage() {
		ModelAndView modelView = new ModelAndView("error");
		return modelView;
	}	
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("student")Student student) {
		ModelAndView model = null;
		System.out.println(student);
		
		if(studentService.checkStudentRegister(student.getUsername(), student.getPassword())) {
			model = new ModelAndView("registerFailure");
		}else {
			studentService.addStudent(student);
			model = new ModelAndView("registerSuccess");
		}
		return model;
	}
	
	@RequestMapping("/registerSuccess")
	public ModelAndView registerSucess() {
		ModelAndView model = new ModelAndView("registerSuccess");
		return model;
	}
	
	@RequestMapping("/registerFailre")
	public ModelAndView registerFailure() {
		ModelAndView model = new ModelAndView("registerFailure");
		return model;
	}
	
}
