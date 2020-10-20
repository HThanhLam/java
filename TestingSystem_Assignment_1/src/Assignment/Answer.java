package Assignment;
import java.util.concurrent.atomic.AtomicInteger;

public class Answer {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int AnswerID;
	private String Content;
	private Question QuestionID;
	private boolean isCorrect;
	public Answer() {
		AnswerID=count.incrementAndGet();
	}
	public int getAnswerID() {
		return AnswerID;
	}
	public String getContent() {
		return Content;
	}
	public Question getQuestionID() {
		return QuestionID;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setAnswerID(int answerID) {
		AnswerID = answerID;
	}
	public void setContent(String content) {
		Content = content;
	}
	public void setQuestionID(Question questionID) {
		QuestionID = questionID;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
}
