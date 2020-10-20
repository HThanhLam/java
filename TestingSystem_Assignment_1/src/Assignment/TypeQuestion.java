package Assignment;
import java.util.concurrent.atomic.AtomicInteger;

public class TypeQuestion {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int TypeID;
	private String TypeName;
	
	public TypeQuestion() {
		TypeID=count.incrementAndGet();
	};
	public int getTypeID() {
		return TypeID;
	}
	public String getTypeName() {
		return TypeName;
	}
	public void setTypeID(int typeID) {
		TypeID = typeID;
	}
	public void setTypeName(String typeName) {
		TypeName = typeName;
	}
	
}
