package Assignment;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Group {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int GroupID;
	private String GroupName;
	private int CreatorID;
	private Date CreateDate;
	
	public Group() {
		GroupID=count.incrementAndGet();
	};
	public int getGroupID() {
		return GroupID;
	}
	public String getGroupName() {
		return GroupName;
	}
	public int getCreatorID() {
		return CreatorID;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setGroupID(int groupID) {
		GroupID = groupID;
	}
	public void setGroupName(String groupName) {
		GroupName = groupName;
	}
	public void setCreatorID(int creatorID) {
		CreatorID = creatorID;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	
}
