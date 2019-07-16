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
import com.project.service.QuestionServiceSt;

@Controller
public class QuestionControllerSt {

	@Autowired
	private QuestionServiceSt questionServiceSt;
	
	@RequestMapping(value = "/st_que_paper")
	public ModelAndView st() {
		ModelAndView model = new ModelAndView("st_que_paper");	
		return model;
	}
	
	@RequestMapping(value = "/st_que_paper",method = RequestMethod.POST)
	public ModelAndView addQuesSt(@ModelAttribute("question")Question question) {
		ModelAndView model = new ModelAndView("st_que_paper");
		questionServiceSt.addQue(question);
		return model;
	}

	@ModelAttribute
	public void addQueObj(Model model) {
		List<Question> queListSt = questionServiceSt.getAllques();
		model.addAttribute("queListSt",queListSt);
	}
	
	@RequestMapping("/showQueSt")
	public ModelAndView showQue() {
		ModelAndView model = new ModelAndView("showQueSt");
		return model;
	}
	
	@RequestMapping(value = "deletequeSt/{id}")
	public ModelAndView deleteQue(@PathVariable("id")int id) {
		questionServiceSt.deleteQue(id);
		return new ModelAndView("redirect:/showQueSt");
	}

	@RequestMapping("/updatequeSt/{id}")
	public ModelAndView updateQue(@PathVariable("id")int id) {
		List<Question> questionList = questionServiceSt.getAllques();
		ModelAndView model = new ModelAndView("updatequeSt");
       		
		for(Question ques : questionList) {
		     if(ques.getQid() == id) {
		         model.addObject("question",ques);
		         break;
		     }	
		}

		return model;
	}
	
	@RequestMapping("updatequeSt/showQueSt/{id}")
	public ModelAndView updatedQue(@ModelAttribute("question")Question question,@PathVariable("id")int qid) {
		System.out.println("update Ques:"+question);
		questionServiceSt.modifyQue(question, qid);
		ModelAndView model = new ModelAndView("redirect:/showQueSt");
		return model;
	}

	public QuestionServiceSt getQuestionServiceSt() {
		return questionServiceSt;
	}

	public void setQuestionServiceSt(QuestionServiceSt questionServiceSt) {
		this.questionServiceSt = questionServiceSt;
	}
	
	
}
