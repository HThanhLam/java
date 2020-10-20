package Assignment;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
public class Account {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int AccountID;
	private String	Email;
	private String Username;
	private String FullName;
	private Department DepartmentID;
	private Position PositionID;
	private Date Createdate;
	
	public Account() {
		AccountID=count.incrementAndGet();
	};
	public int getAccountID() {
		return AccountID;
	}
	public String getEmail() {
		return Email;
	}
	public String getUsername() {
		return Username;
	}
	public String getFullName() {
		return FullName;
	}
	public Department getDepartmentID() {
		return DepartmentID;
	}
	public Position getPositionID() {
		return PositionID;
	}
	public Date getCreatedate() {
		return Createdate;
	}
	public void setAccountID(int accountID) {
		AccountID = accountID;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public void setDepartmentID(Department departmentID) {
		DepartmentID = departmentID;
	}
	public void setPositionID(Position positionID) {
		PositionID = positionID;
	}
	public void setCreatedate(Date createdate) {
		Createdate = createdate;
	}
	
}
