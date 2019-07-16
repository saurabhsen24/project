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
import com.project.service.QuestionServiceCd;
import com.project.service.QuestionServiceCg;

@Controller
public class QuestionControllerCg {
	
	@Autowired
	private QuestionServiceCg questionServiceCg;
	
	@RequestMapping(value = "/cg_que_paper")
	public ModelAndView cd() {
		ModelAndView model = new ModelAndView("cg_que_paper");	
		return model;
	}
	
	@RequestMapping(value = "/cg_que_paper", method = RequestMethod.POST)
	public ModelAndView addQuestionCg(@ModelAttribute("que")Question question) {
		ModelAndView model = new ModelAndView("cg_que_paper");
	    questionServiceCg.addQue(question);	
		return model;
	}

	@ModelAttribute
	public void addQueObj(Model model) {
		List<Question> queListCg = questionServiceCg.getAllques();
		model.addAttribute("queListCg",queListCg);
	}
	
	@RequestMapping("/showQueCg")
	public ModelAndView showQueCg() {
		ModelAndView model = new ModelAndView("showQueCg");
		return model;
	}
	
	@RequestMapping(value = "deletequeCg/{id}")
	public ModelAndView deleteQue(@PathVariable("id")int id) {
		questionServiceCg.deleteQue(id);
		return new ModelAndView("redirect:/showQueCg");
	}

	@RequestMapping("/updatequeCg/{id}")
	public ModelAndView updateQue(@PathVariable("id")int id) {
		List<Question> questionList = questionServiceCg.getAllques();
		ModelAndView model = new ModelAndView("updatequeCg");
       		
		for(Question ques : questionList) {
		     if(ques.getQid() == id) {
		         model.addObject("question",ques);
		         break;
		     }	
		}

		return model;
	}
	
	@RequestMapping("updatequeCg/showQueCg/{id}")
	public ModelAndView updatedQue(@ModelAttribute("question")Question question,@PathVariable("id")int qid) {
		System.out.println("update Ques:"+question);
		questionServiceCg.modifyQue(question, qid);
		ModelAndView model = new ModelAndView("redirect:/showQueCg");
		return model;
	}
	
	public QuestionServiceCg getQuestionServiceCg() {
		return questionServiceCg;
	}

	public void setQuestionServiceCg(QuestionServiceCg questionServiceCg) {
		this.questionServiceCg = questionServiceCg;
	}
}
