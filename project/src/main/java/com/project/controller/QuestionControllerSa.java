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
import com.project.service.QuestionServiceSa;

@Controller
public class QuestionControllerSa {

	@Autowired
	private QuestionServiceSa questionServiceSa;
	
	@RequestMapping(value = "/sa_que_paper")
	public ModelAndView sa() {
		ModelAndView model = new ModelAndView("sa_que_paper");	
		return model;
	}
	
	@RequestMapping(value = "/sa_que_paper",method = RequestMethod.POST)
	public ModelAndView addQuesSa(@ModelAttribute("question")Question question) {
		ModelAndView model = new ModelAndView("sa_que_paper");
		questionServiceSa.addQue(question);
		return model;
	}

	@ModelAttribute
	public void addQueObj(Model model) {
		List<Question> queListSa = questionServiceSa.getAllques();
		model.addAttribute("queListSa",queListSa);
	}
	
	@RequestMapping("/showQueSa")
	public ModelAndView showQue() {
		ModelAndView model = new ModelAndView("showQueSa");
		return model;
	}
	
	@RequestMapping(value = "deletequeSa/{id}")
	public ModelAndView deleteQue(@PathVariable("id")int id) {
		questionServiceSa.deleteQue(id);
		return new ModelAndView("redirect:/showQueSa");
	}

	@RequestMapping("/updatequeSa/{id}")
	public ModelAndView updateQue(@PathVariable("id")int id) {
		List<Question> questionList = questionServiceSa.getAllques();
		ModelAndView model = new ModelAndView("updatequeSa");
       		
		for(Question ques : questionList) {
		     if(ques.getQid() == id) {
		         model.addObject("question",ques);
		         break;
		     }	
		}

		return model;
	}
	
	@RequestMapping("updatequeSa/showQueSa/{id}")
	public ModelAndView updatedQue(@ModelAttribute("question")Question question,@PathVariable("id")int qid) {
		System.out.println("update Ques:"+question);
		questionServiceSa.modifyQue(question, qid);
		ModelAndView model = new ModelAndView("redirect:/showQueSa");
		return model;
	}

	public QuestionServiceSa getQuestionServiceSa() {
		return questionServiceSa;
	}

	public void setQuestionServiceSa(QuestionServiceSa questionServiceSa) {
		this.questionServiceSa = questionServiceSa;
	}
	
	
}
