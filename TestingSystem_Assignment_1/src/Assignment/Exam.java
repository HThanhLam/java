package Assignment;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Exam {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int ExamID;
	private int Code;
	private String Title;
	private CatagoryQuestion CatagoryID;
	private String Duration;
	private int CreatorID;
	private Date CreateDate;
	public Exam() {
		ExamID=count.incrementAndGet();
	}
	public int getExamID() {
		return ExamID;
	}
	public int getCode() {
		return Code;
	}
	public String getTitle() {
		return Title;
	}
	public CatagoryQuestion getCatagoryID() {
		return CatagoryID;
	}
	public String getDuration() {
		return Duration;
	}
	public int getCreatorID() {
		return CreatorID;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setExmaID(int exmaID) {
		ExamID = exmaID;
	}
	public void setCode(int code) {
		Code = code;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public void setCatagoryID(CatagoryQuestion catagoryID) {
		CatagoryID = catagoryID;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public void setCreatorID(int creatorID) {
		CreatorID = creatorID;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
}
