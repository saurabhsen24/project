package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Question;
import com.project.model.Teacher;
import com.project.service.TeacherService;

@Controller
@SessionAttributes("teacherName")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;

	@RequestMapping("/registerCheckUserPresent")
	public ModelAndView registerTeacher(@ModelAttribute("teacher")Teacher teacher) {
		ModelAndView model = null;
		if(teacherService.checkTeacherRegister(teacher.getUsername(), teacher.getPassword())) {
			model = new ModelAndView("registerFailure");
		}else {
			System.out.println(teacher);
			teacherService.addTeacher(teacher);
			model = new ModelAndView("registerSuccess");
		}
		return model;
	}	

	@RequestMapping(value = "/checkInfoTeacher",method = RequestMethod.POST)
	public ModelAndView checkInfoTeacher(@RequestParam("username")String username,@RequestParam("password")String password) {
		ModelAndView modelview = null;
		if(teacherService.checkTeacherRegister(username, password)) {
			modelview = new ModelAndView("dashboardTeacher");
			modelview.addObject("teacherName",username);
		}else {
			if(teacherService.cheackIfUserisPresent(username, password) == 0) {
				modelview = new ModelAndView("wrongInfoTeacher");
			}
			
			if(teacherService.cheackIfUserisPresent(username, password) == -1) {
				modelview = new ModelAndView("registerTeacher");
			}
		}
		
		return modelview;
	}
	
	@RequestMapping("/dashboardTeacher")
	public ModelAndView dashboardPageStudent() {
		ModelAndView model = new ModelAndView("dashboardTeacher");
		return model;
	}
	
	@RequestMapping("/iwt_que_paper")
	public ModelAndView iwtQuestion() {
		ModelAndView model = new ModelAndView("iwt_que_paper");
		return model;
	}
	
	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
}
