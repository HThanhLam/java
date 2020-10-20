package Assignment;
import java.util.concurrent.atomic.AtomicInteger;

public class CatagoryQuestion {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int CategoryID;
	private String CategoryName;
	public CatagoryQuestion() {
		CategoryID=count.incrementAndGet();
	}
	public int getCategoryID() {
		return CategoryID;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
}
