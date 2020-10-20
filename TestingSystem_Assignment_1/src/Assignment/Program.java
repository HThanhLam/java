package Assignment;

public class Program {
	public static void main(String[] args) {
		Account[] Created_ac= new Account[3];
		Created_ac[0] = new Account();
		Created_ac[1] = new Account();
		Created_ac[2] = new Account();
		Answer Answer[]= new Answer[3];
		Answer[0] = new Answer();
		Answer[1] = new Answer();
		Answer[2] = new Answer();
		CatagoryQuestion CaQue[]= new CatagoryQuestion[3];
		CaQue[0] = new CatagoryQuestion();
		CaQue[1] = new CatagoryQuestion();
		CaQue[2] = new CatagoryQuestion();
		Department	dep[]= new Department[3];
		dep[0] = new Department();
		dep[1] = new Department();
		dep[2] = new Department();
		Exam exam[]= new Exam[3];
		exam[0] = new Exam();
		exam[1] = new Exam();
		exam[2] = new Exam();
		ExamQuestion ExamQ[]= new ExamQuestion[3];
		ExamQ[0] = new ExamQuestion();
		ExamQ[1] = new ExamQuestion();
		ExamQ[2] = new ExamQuestion();
		Group group[]= new Group[3];
		group[0] = new Group();
		group[1] = new Group();
		group[2] = new Group();
		GroupAccount GpAcc[]= new GroupAccount[3];
		GpAcc[0] = new GroupAccount();
		GpAcc[1] = new GroupAccount();
		GpAcc[2] = new GroupAccount();
		Position pos[]= new Position[3];
		pos[0] = new Position();
		pos[1] = new Position();
		pos[2] = new Position();
		Question que[]= new Question[3];
		que[0] = new Question();
		que[1] = new Question();
		que[2] = new Question();
		TypeQuestion typeq[]= new TypeQuestion[3];
		typeq[0] = new TypeQuestion();
		typeq[1] = new TypeQuestion();
		typeq[2] = new TypeQuestion();
		System.out.println("AccountID:" + Created_ac[0].getAccountID());
		System.out.println("AnswerID:" + Answer[0].getAnswerID());
		System.out.println("CatagoryQuestionID:" + CaQue[0].getCategoryID());
		System.out.println("DepartmentID:" + dep[0].getDepartmentID());
		System.out.println("ExamID:" + exam[0].getExamID());
		System.out.println("ExamQuestionID:" + ExamQ[0].getExamID()+";"+ExamQ[0].getQuestionID());
		System.out.println("GroupID:" + group[0].getGroupID());
		System.out.println("GroupAccountID:" + GpAcc[0].getGroupID());
		System.out.println("PositionID:" + pos[0].getPositionID());
		System.out.println("QuestionID:" + que[0].getQuestionID());
		System.out.println("TypeQuestionID:" + typeq[0].getTypeID());
}
	
};

