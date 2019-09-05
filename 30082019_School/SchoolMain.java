import java.util.ArrayList;
import java.util.List;

public class SchoolMain {

	public static void main(String[] args) {	
		
		//---------------------------------------------
		List<Subject> fsdSubList = new ArrayList<Subject>();
		Subject sub1= new Subject(1101, "java", 24, 50);
		Subject sub2= new Subject(1102, "frontend", 24, 50);
		Subject sub3= new Subject(1103, "backend", 24, 50);
		fsdSubList.add(sub1); fsdSubList.add(sub2); fsdSubList.add(sub3);
		
		List<Integer> marksGot1 = new ArrayList<Integer>();
		marksGot1.add(40); marksGot1.add(2); marksGot1.add(1);
		List<Integer> marksGot2 = new ArrayList<Integer>();
		marksGot2.add(35); marksGot2.add(38); marksGot2.add(45);
		List<Integer> marksGot3 = new ArrayList<Integer>();
		marksGot3.add(43); marksGot3.add(37); marksGot3.add(41);		
		
		List<Student> fsdStudentList = new ArrayList<Student>();
		Student s1 = new Student(1, "aaa", marksGot1, fsdSubList);
		Student s2 = new Student(2, "bbb", marksGot2, fsdSubList);
		Student s3 = new Student(3, "ccc", marksGot3, fsdSubList);		
		fsdStudentList.add(s1);	fsdStudentList.add(s2);	fsdStudentList.add(s3);
		
		ClassRoom fsd=new ClassRoom(125, "FSD", fsdSubList, fsdStudentList);
		System.out.println(fsd);
		//------------------------------------------------------------
		List<Subject> sapSubList = new ArrayList<Subject>();
		Subject sub21= new Subject(1101, "sap", 24, 50);
		Subject sub22= new Subject(1102, "hana", 24, 50);
		Subject sub23= new Subject(1103, "server", 24, 50);
		sapSubList.add(sub21); sapSubList.add(sub22); sapSubList.add(sub23);
		
		List<Integer> marksGot21 = new ArrayList<Integer>();
		marksGot21.add(31); marksGot21.add(35); marksGot21.add(33);
		List<Integer> marksGot22 = new ArrayList<Integer>();
		marksGot22.add(39); marksGot22.add(38); marksGot22.add(47);
		List<Integer> marksGot23 = new ArrayList<Integer>();
		marksGot23.add(49); marksGot23.add(2); marksGot23.add(42);
		
		List<Student> sapStudentList = new ArrayList<Student>();
		Student s21 = new Student(1, "xxx", marksGot21, sapSubList);
		Student s22 = new Student(2, "yyy", marksGot22, sapSubList);
		Student s23 = new Student(3, "zzz", marksGot23, sapSubList);
		
		sapStudentList.add(s21); sapStudentList.add(s22); sapStudentList.add(s23);
		
		ClassRoom sap=new ClassRoom(118, "SAP", sapSubList, sapStudentList);
		System.out.println(sap);
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		List<ClassRoom> classRoomListOfMain = new ArrayList<ClassRoom>();
		classRoomListOfMain.add(fsd);
		classRoomListOfMain.add(sap);
		System.out.println("***********************CLASS WISE TOPPERS************************");
		ClassRoom.cTopper(classRoomListOfMain);
		System.out.println("***********************SUBJECT WISE TOPPERS************************");
		ClassRoom.sTopper(fsdStudentList);
		ClassRoom.sTopper(sapStudentList);
		System.out.println("***********************SCHOOL TOPPER************************");
		ClassRoom.schoolTopper(new ClassRoom().getcTopperList());


	}

}
