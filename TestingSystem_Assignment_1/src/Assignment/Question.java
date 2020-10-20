package Assignment;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;


public class Question {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int QuestionID;
	private String Content;
	private CatagoryQuestion CategoryID;
	private TypeQuestion TypeID;
	private Date CreatorID;
	private Date CreateDate;
	public Question() {
		QuestionID=count.incrementAndGet();
	}
	public int getQuestionID() {
		return QuestionID;
	}
	public String getContent() {
		return Content;
	}
	public CatagoryQuestion getCategoryID() {
		return CategoryID;
	}
	public TypeQuestion getTypeID() {
		return TypeID;
	}
	public Date getCreatorID() {
		return CreatorID;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setQuestionID(int questionID) {
		QuestionID = questionID;
	}
	public void setContent(String content) {
		Content = content;
	}
	public void setCategoryID(CatagoryQuestion categoryID) {
		CategoryID = categoryID;
	}
	public void setTypeID(TypeQuestion typeID) {
		TypeID = typeID;
	}
	public void setCreatorID(Date creatorID) {
		CreatorID = creatorID;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
}
