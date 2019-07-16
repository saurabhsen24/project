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

@Controller
public class QuestionControllerCd {

	@Autowired
	private QuestionServiceCd questionServiceCd;
	
	@RequestMapping(value = "/cd_que_paper")
	public ModelAndView cd() {
		ModelAndView model = new ModelAndView("cd_que_paper");	
		return model;
	}
	
	@RequestMapping(value = "/cd_que_paper",method = RequestMethod.POST)
	public ModelAndView addQuesCd(@ModelAttribute("question")Question question) {
		ModelAndView model = new ModelAndView("cd_que_paper");
		questionServiceCd.addQue(question);
		return model;
	}

	@ModelAttribute
	public void addQueObj(Model model) {
		List<Question> queListCd = questionServiceCd.getAllques();
		model.addAttribute("queListCd",queListCd);
	}
	
	@RequestMapping("/showQueCd")
	public ModelAndView showQue() {
		ModelAndView model = new ModelAndView("showQueCd");
		return model;
	}
	
	@RequestMapping(value = "deletequeCd/{id}")
	public ModelAndView deleteQue(@PathVariable("id")int id) {
		questionServiceCd.deleteQue(id);
		return new ModelAndView("redirect:/showQueCd");
	}

	@RequestMapping("/updatequeCd/{id}")
	public ModelAndView updateQue(@PathVariable("id")int id) {
		List<Question> questionList = questionServiceCd.getAllques();
		ModelAndView model = new ModelAndView("updatequeCd");
       		
		for(Question ques : questionList) {
		     if(ques.getQid() == id) {
		         model.addObject("question",ques);
		         break;
		     }	
		}

		return model;
	}
	
	@RequestMapping("updatequeCd/showQueCd/{id}")
	public ModelAndView updatedQue(@ModelAttribute("question")Question question,@PathVariable("id")int qid) {
		System.out.println("update Ques:"+question);
		questionServiceCd.modifyQue(question, qid);
		ModelAndView model = new ModelAndView("redirect:/showQueCd");
		return model;
	}
	
	public QuestionServiceCd getQuestionServiceCd() {
		return questionServiceCd;
	}

	public void setQuestionServiceCd(QuestionServiceCd questionServiceCd) {
		this.questionServiceCd = questionServiceCd;
	}

}

