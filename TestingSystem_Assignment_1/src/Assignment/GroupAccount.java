package Assignment;
import java.util.Date;

public class GroupAccount {
	private Group GroupID;
	private Account AccountID;
	private Date JoinDate;
	public Group getGroupID() {
		return GroupID;
	}
	public Account getAccountID() {
		return AccountID;
	}
	public Date getJoinDate() {
		return JoinDate;
	}
	public void setGroupID(Group groupID) {
		GroupID = groupID;
	}
	public void setAccountID(Account accountID) {
		AccountID = accountID;
	}
	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}
	
}
