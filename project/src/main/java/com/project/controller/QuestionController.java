package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Question;
import com.project.service.QuestionServiceCc;
import com.project.service.QuestionServiceCd;
import com.project.service.QuestionServiceCg;
import com.project.service.QuestionServiceIwt;
import com.project.service.QuestionServiceSa;
import com.project.service.QuestionServiceSt;

@Controller
public class QuestionController {

	@Autowired
	private QuestionServiceIwt questionServiceIwt;	
	
	@RequestMapping(value = "/iwt_que_paper", method = RequestMethod.POST)
	public ModelAndView addQuestionIwt(@ModelAttribute("que")Question question) {
		ModelAndView model = new ModelAndView("iwt_que_paper");
	    questionServiceIwt.addQue(question);	
		return model;
	}
	
	
	@ModelAttribute
	public void addQueObj(Model model) {
		List<Question> queListIwt = questionServiceIwt.getAllques();
		model.addAttribute("queListIwt",queListIwt);
	}
	
	
	@RequestMapping("/showQueIwt")
	public ModelAndView showQue() {
		ModelAndView model = new ModelAndView("showQueIwt");
		return model;
	}
	
	@RequestMapping(value = "deletequeIwt/{id}")
	public ModelAndView deleteQue(@PathVariable("id")int id) {
		questionServiceIwt.deleteQue(id);
		return new ModelAndView("redirect:/showQueIwt");
	}

	@RequestMapping("/updatequeIwt/{id}")
	public ModelAndView updateQue(@PathVariable("id")int id) {
		List<Question> questionList = questionServiceIwt.getAllques();
		ModelAndView model = new ModelAndView("updatequeIwt");
       		
		for(Question ques : questionList) {
		     if(ques.getQid() == id) {
		         model.addObject("question",ques);
		         break;
		     }	
		}

		return model;
	}
	
	@RequestMapping("updatequeIwt/showQueIwt/{id}")
	public ModelAndView updatedQue(@ModelAttribute("question")Question question,@PathVariable("id")int qid) {
		System.out.println("update Ques:"+question);
		questionServiceIwt.modifyQue(question, qid);
		ModelAndView model = new ModelAndView("redirect:/showQueIwt");
		return model;
	}
	
	public QuestionServiceIwt getQuestionService() {
		return questionServiceIwt;
	}

	public void setQuestionService(QuestionServiceIwt questionService) {
		this.questionServiceIwt = questionService;
	}	
		
}
