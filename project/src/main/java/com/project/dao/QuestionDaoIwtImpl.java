package com.project.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.model.Question;

@Repository
public class QuestionDaoIwtImpl implements QuestionDaoIwt{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_QUERY = "INSERT INTO QUESTIONIWT(que,opt1,opt2,opt3,opt4,ans) values(?,?,?,?,?,?)";
	private static final String SELECT_ALL = "SELECT * from QUESTIONIWT";
	private static final String UPDATE_QUERY = "UPDATE QUESTIONIWT SET qid = ?,que = ?,opt1 = ?,opt2 = ?,opt3 = ?,opt4 = ?,ans = ? where qid = ?"; 
	private static final String DELETE_QUERY = "DELETE from QUESTIONIWT where qid = ?";	
	
	@Override
	public void addQue(Question question) {
		// TODO Auto-generated method stub
	  int i = jdbcTemplate.update(INSERT_QUERY,new Object[] {question.getQue(),question.getOpt1(),question.getOpt2(),question.getOpt3(),question.getOpt4(),question.getAns()});
	  System.out.println("Success or Failure : "+i); 	
	}

	@Override
	public void deleteQue(int qid) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(DELETE_QUERY,qid);
		
	}

	@Override
	public void modifyQue(Question question,int qid) {
		// TODO Auto-generated method stub
		int i = jdbcTemplate.update(UPDATE_QUERY,new Object[] {question.getQid(),question.getQue(),question.getOpt1(),question.getOpt2(),question.getOpt3(),question.getOpt4(),question.getAns(),qid});
	    if(i == 0) {
	    	System.out.println("Failue update");
	    }else {
	    	System.out.println("Success update");
	    }
	}
	
	public List<Question> getAllques(){
		List<Question> quesList = new ArrayList<>();
		List<Map<String,Object>> queRows = jdbcTemplate.queryForList(SELECT_ALL);
		System.out.println("Map<String,Object> "+queRows);
		for(Map<String,Object> queRow : queRows) {
			    Question question = new Question();
			    question.setQid(Integer.parseInt(String.valueOf(queRow.get("qid"))));
			    question.setQue(String.valueOf(queRow.get("que")));
			    question.setOpt1(String.valueOf(queRow.get("opt1")));
			    question.setOpt2(String.valueOf(queRow.get("opt2")));
			    question.setOpt3(String.valueOf(queRow.get("opt3")));
			    question.setOpt4(String.valueOf(queRow.get("opt4")));
			    question.setAns(String.valueOf(queRow.get("ans")));
			    System.out.println(question);
			    quesList.add(question);
		}
		
		System.out.println(quesList);
		return quesList;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
