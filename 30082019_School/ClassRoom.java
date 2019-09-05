import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
	int id;
	String name;
	Student cTopper= new Student();
	public static Student schoolTopper= new Student();

	public static List<Student> cTopperList = new ArrayList<Student>();
	List<Subject> subListOfClassRoom = new ArrayList<Subject>();
	List<Student> studentListOfClassRoom = new ArrayList<Student>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Student getcTopper() {
		return cTopper;
	}
	public void setcTopper(Student cTopper) {
		this.cTopper = cTopper;
	}
	
	public Student getSchoolTopper() {
		return schoolTopper;
	}

	public List<Student> getcTopperList() {
		return cTopperList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subject> getSubListOfClassRoom() {
		return subListOfClassRoom;
	}
	public void setSubListOfClassRoom(List<Subject> subListOfClassRoom) {
		this.subListOfClassRoom = subListOfClassRoom;
	}
	public List<Student> getStudentListOfClassRoom() {
		return studentListOfClassRoom;
	}
	public void setStudentListOfClassRoom(List<Student> studentListOfClassRoom) {
		this.studentListOfClassRoom = studentListOfClassRoom;
	}
	public ClassRoom() {
		// TODO Auto-generated constructor stub
	}
		

	public ClassRoom(int id, String name, List<Subject> subListOfClassRoom, List<Student> studentListOfClassRoom) {
		super();
		this.id = id;
		this.name = name;
		this.subListOfClassRoom = subListOfClassRoom;
		this.studentListOfClassRoom = studentListOfClassRoom;
	}
	
	public static void cTopper(List<ClassRoom> classRoomList){		
		classRoomList.forEach(cR->{			
			cR.studentListOfClassRoom.forEach(s->{				
				if(cR.getcTopper().getTotal()<=s.getTotal()) {
					cR.setcTopper(s);
					}
			});
			System.out.println("The topper of class " + cR.getName() + " is " + cR.getcTopper());
			ClassRoom.cTopperList.add(cR.getcTopper());
			
		});
		
	}

	public static void sTopper(List<Student> studentList){
		Student sT= studentList.get(0);
			int k=1;
			while(k<=sT.marksGot.size()) {
				for(int j=1; j<studentList.size(); j++) {					
						if(sT.marksGot.get(k-1)<=studentList.get(j).marksGot.get(k-1)) {
							sT=studentList.get(j);
										}
								}
				sT.setsTopper(sT);
				System.out.println("The topper of subject " + sT.getSubjectListOfStudent().get(k-1).getName() + " is " + sT.getsTopper());
				k++;
			}
	}
	
	public static void schoolTopper(List<Student> cTopperList){
		schoolTopper= cTopperList.get(0);
			for(int i=1;i<cTopperList.size();i++) {
				if(cTopperList.get(i).getTotal()>=schoolTopper.getTotal()) {
					schoolTopper=cTopperList.get(i);
					}
			
			System.out.println("The topper of School " + schoolTopper.getName() + " is " + new ClassRoom().getSchoolTopper());
				
	}
	}
	
	@Override
	public String toString() {
		return "ClassRoom [id=" + id + ", name=" + name + "\n" + "Subject=\n" + subListOfClassRoom + "\n" + "Student=\n" + studentListOfClassRoom + "]\n";
	}
	
}
