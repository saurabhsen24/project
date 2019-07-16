package com.project.model;

public class Answer {
  private int aid;
  private String ans;
  private int qid;
  
  
  public int getAid() {
	  return aid;
  }

  public void setAid(int aid) {
	  this.aid = aid;
  }

  public String getAns() {
	  return ans;
  }

  public void setAns(String ans) {
	  this.ans = ans;
  }

  public int getQid() {
	  return qid;
  }

  public void setQid(int qid) {
	 this.qid = qid;
  }

  @Override
  public String toString() {
	  return "Answer [aid=" + aid + ", ans=" + ans + ", qid=" + qid + "]";
  }
  

  
}
