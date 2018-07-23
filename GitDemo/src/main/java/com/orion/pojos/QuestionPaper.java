package com.orion.pojos;

public class QuestionPaper {

	
	private int qpid;
	
	
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String correctOption;
	private int marks;
		
	public QuestionPaper(int qpid, String question, String optionA, String optionB, String optionC, String optionD,
			String correctOption, int marks) {
		super();
		this.qpid = qpid;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.correctOption = correctOption;
		this.marks = marks;
	}
	
	public QuestionPaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQpid() {
		return qpid;
	}
	public void setQpid(int qpid) {
		this.qpid = qpid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getCorrectOption() {
		return correctOption;
	}
	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
