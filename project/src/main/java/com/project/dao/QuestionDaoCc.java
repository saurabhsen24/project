package com.project.dao;

import java.util.List;

import com.project.model.Question;

public interface QuestionDaoCc {
	
	public void addQue(Question question);

	public void deleteQue(int qid);
	
	public void modifyQue(Question question,int qid);
	
	public List<Question> getAllques();
}
