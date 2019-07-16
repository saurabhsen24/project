package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.QuestionDaoIwt;
import com.project.dao.QuestionDaoSa;
import com.project.model.Question;

@Service
public class QuestionServiceSaImpl implements QuestionServiceSa{

	@Autowired
	private QuestionDaoSa queDao;
	
	@Override
	public void addQue(Question question) {
		// TODO Auto-generated method stub
	   queDao.addQue(question);	
	}

	@Override
	public void deleteQue(int qid) {
		// TODO Auto-generated method stub
	  queDao.deleteQue(qid);	
	}

	@Override
	public void modifyQue(Question question, int qid) {
		// TODO Auto-generated method stub
		queDao.modifyQue(question, qid);
	}

	@Override
	public List<Question> getAllques() {
		// TODO Auto-generated method stub
		return queDao.getAllques();
	}

	public QuestionDaoSa getQueDao() {
		return queDao;
	}

	public void setQueDao(QuestionDaoSa queDao) {
		this.queDao = queDao;
	}
	
	
}
