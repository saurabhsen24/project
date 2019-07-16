package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.QuestionDaoSt;
import com.project.model.Question;

@Service
public class QuestionServiceStImpl implements QuestionServiceSt{
	
	@Autowired
	private QuestionDaoSt queDao;
	
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

	public QuestionDaoSt getQueDao() {
		return queDao;
	}

	public void setQueDao(QuestionDaoSt queDao) {
		this.queDao = queDao;
	}
		

}
