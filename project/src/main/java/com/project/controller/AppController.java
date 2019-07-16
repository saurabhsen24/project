package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Question;
import com.project.service.QuestionServiceCc;
import com.project.service.QuestionServiceCd;
import com.project.service.QuestionServiceCg;
import com.project.service.QuestionServiceIwt;
import com.project.service.QuestionServiceSa;
import com.project.service.QuestionServiceSt;
import com.project.service.StudentService;

@Controller
@SessionAttributes({"studentName","teacherName"})
public class AppController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private QuestionServiceIwt questionServiceIwt;
	
	@Autowired
	private QuestionServiceCd questionServiceCd;
	
	@Autowired
	private QuestionServiceCg questionServiceCg;	
	
	@Autowired
	private QuestionServiceCc questionServiceCc;
	
	@Autowired
	private QuestionServiceSa questionServiceSa;
	
	@Autowired
	private QuestionServiceSt questionServiceSt;
	
	StudentController student = new StudentController();
	
	@RequestMapping("/")
	public ModelAndView indexPage() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
		
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView modelView = new ModelAndView("login");
		return modelView;
	}
	
	@RequestMapping("/loginStudent")
	public ModelAndView studentLoginPage() {
		ModelAndView model = new ModelAndView("loginStudent");
		return model;
	}
	
	@RequestMapping("/loginTeacher")
	public ModelAndView teacherLoginPage() {
		ModelAndView model = new ModelAndView("loginTeacher");
		return model;
	}	
	
	@RequestMapping("/registerStudent")
	public ModelAndView registerStudent() {
		ModelAndView model = new ModelAndView("registerStudent");
		return model;
	}
	
	
	@RequestMapping("/registerTeacher")
	public ModelAndView registerTeacher() {
		ModelAndView model = new ModelAndView("registerTeacher");
		return model;
	}	
	
	@RequestMapping(value = "/iwt")
	public ModelAndView iwtPage() {
		ModelAndView model = new ModelAndView("iwt");
		List<Question> iwtQues = questionServiceIwt.getAllques();
		model.addObject("iwtQues", iwtQues);		
		return model;
	}
	
	@RequestMapping(value = "/resultIwt", method = RequestMethod.GET)
	public ModelAndView resultIwt() {
		ModelAndView model = new ModelAndView("resultIwt");
		List<Question> iwtQues = questionServiceIwt.getAllques();
		model.addObject("iwtQues", iwtQues);		
		return model;
	}
	
	@RequestMapping("/result")
	public ModelAndView result() {
		ModelAndView model = new ModelAndView("result");
		List<Question> iwtQues = questionServiceIwt.getAllques();
		model.addObject("iwtQues", iwtQues);		
		return model;
	}
	
	@RequestMapping(value = "/cd")
	public ModelAndView cdPage() {
		ModelAndView model = new ModelAndView("cd");
		List<Question> cdQues = questionServiceCd.getAllques();
		model.addObject("cdQues", cdQues);
		return model;
	}
	
	@RequestMapping(value = "/resultCd", method = RequestMethod.GET)
	public ModelAndView resultCd() {
		ModelAndView model = new ModelAndView("resultCd");
		List<Question> cdQues = questionServiceCd.getAllques();
		System.out.println("Model Obj:"+cdQues);
		model.addObject("cdQues", cdQues);		
		return model;
	}	
	
	@RequestMapping(value = "/cg")
	public ModelAndView cgPage() {
		ModelAndView model = new ModelAndView("cg");
		List<Question> cgQues = questionServiceCg.getAllques();
		model.addObject("cgQues", cgQues);		
		return model;
	}
	
	@RequestMapping(value = "/resultCg", method = RequestMethod.GET)
	public ModelAndView resultCg() {
		ModelAndView model = new ModelAndView("resultCg");
		List<Question> cgQues = questionServiceCg.getAllques();
		model.addObject("cgQues", cgQues);		
		return model;
	}	
	
	@RequestMapping(value = "/cloud")
	public ModelAndView cloudPage() {
		ModelAndView model = new ModelAndView("cloud");
		List<Question> ccQues = questionServiceCc.getAllques();
		model.addObject("ccQues", ccQues);		
		return model;
	}

	@RequestMapping(value = "/resultCc", method = RequestMethod.GET)
	public ModelAndView resultCc() {
		ModelAndView model = new ModelAndView("resultCc");
		List<Question> ccQues = questionServiceCc.getAllques();
		model.addObject("ccQues", ccQues);		
		return model;
	}		
	
	
	@RequestMapping(value = "/st")
	public ModelAndView stPage() {
		ModelAndView model = new ModelAndView("st");
		List<Question> stQues = questionServiceSt.getAllques();
		model.addObject("stQues", stQues);		
		return model;
	}
	
	
	@RequestMapping(value = "/resultSt", method = RequestMethod.GET)
	public ModelAndView resultSt() {
		ModelAndView model = new ModelAndView("resultSt");
		List<Question> stQues = questionServiceSt.getAllques();
		model.addObject("stQues", stQues);		
		return model;
	}	
	
	
	@RequestMapping(value = "/sa")
	public ModelAndView saPage() {
		ModelAndView model = new ModelAndView("sa");
		List<Question> saQues = questionServiceSa.getAllques();
		model.addObject("saQues", saQues);	
		return model;
	}		
	
	@RequestMapping(value = "/resultSa", method = RequestMethod.GET)
	public ModelAndView resultSa() {
		ModelAndView model = new ModelAndView("resultSa");
		List<Question> saQues = questionServiceSa.getAllques();
		model.addObject("saQues", saQues);		
		return model;
	}	
	
}
