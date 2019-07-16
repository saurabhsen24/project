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

@Controller
public class QuestionControllerCc {
	
	@Autowired
	private QuestionServiceCc questionServiceCc;
	
	@RequestMapping(value = "/cc_que_paper")
	public ModelAndView cc() {
		ModelAndView model = new ModelAndView("cc_que_paper");	
		return model;
	}
	
	@RequestMapping(value = "/cc_que_paper",method = RequestMethod.POST)
	public ModelAndView addQuesCc(@ModelAttribute("question")Question question) {
		ModelAndView model = new ModelAndView("cc_que_paper");
		questionServiceCc.addQue(question);
		return model;
	}

	@ModelAttribute
	public void addQueObj(Model model) {
		List<Question> queListCc = questionServiceCc.getAllques();
		model.addAttribute("queListCc",queListCc);
	}
	
	@RequestMapping("/showQueCc")
	public ModelAndView showQue() {
		ModelAndView model = new ModelAndView("showQueCc");
		return model;
	}
	
	@RequestMapping(value = "deletequeCc/{id}")
	public ModelAndView deleteQue(@PathVariable("id")int id) {
		questionServiceCc.deleteQue(id);
		return new ModelAndView("redirect:/showQueCc");
	}

	@RequestMapping("/updatequeCc/{id}")
	public ModelAndView updateQue(@PathVariable("id")int id) {
		List<Question> questionList = questionServiceCc.getAllques();
		ModelAndView model = new ModelAndView("updatequeCc");
       		
		for(Question ques : questionList) {
		     if(ques.getQid() == id) {
		         model.addObject("question",ques);
		         break;
		     }	
		}

		return model;
	}
	
	@RequestMapping("updatequeCc/showQueCc/{id}")
	public ModelAndView updatedQue(@ModelAttribute("question")Question question,@PathVariable("id")int qid) {
		System.out.println("update Ques:"+question);
		questionServiceCc.modifyQue(question, qid);
		ModelAndView model = new ModelAndView("redirect:/showQueCc");
		return model;
	}

	public QuestionServiceCc getQuestionServiceCc() {
		return questionServiceCc;
	}

	public void setQuestionServiceCc(QuestionServiceCc questionServiceCc) {
		this.questionServiceCc = questionServiceCc;
	}
	
	
}
