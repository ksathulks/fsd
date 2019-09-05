import java.util.ArrayList;
import java.util.List;

public class Student {
	int id;
	String name;
	int total;
	List<Integer> marksGot = new ArrayList<Integer>();
	List<Subject> subjectListOfStudent = new ArrayList<Subject>();
	Student sTopper;
	boolean result;
	int count;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal() {
		return total;
	}
	public Student getsTopper() {
		return sTopper;
	}
	public void setsTopper(Student sTopper) {
		this.sTopper = sTopper;
	}

	public List<Integer> getMarksGot() {
		return marksGot;
	}

	public void setMarksGot(List<Integer> marksGot) {
		this.marksGot = marksGot;
	}

	public List<Subject> getSubjectListOfStudent() {
		return subjectListOfStudent;
	}

	public void setSubjectListOfStudent(List<Subject> subjectListOfStudent) {
		this.subjectListOfStudent = subjectListOfStudent;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	

	
public Student(int id, String name, List<Integer> marksGot, List<Subject> subjectListOfStudent) {
		super();
		this.id = id;
		this.name = name;
		this.marksGot = marksGot;
		this.total = markSum(marksGot);
		this.subjectListOfStudent = subjectListOfStudent;
		this.count=calcCount(marksGot);
		this.result=calcResult(marksGot);
	}
public static int markSum(List<Integer> marks) {
	int total = 0;
	for (int m : marks) {
		total += m;
	}
	return total;
}

boolean calcResult(List<Integer> marksGot) {
	count = 0;
	
	
		marksGot.forEach(m->{if(m<24) {
			count = count+1;
		}
		
		
	});
	if(count>=2) {
		return false;
	}
	else {
		return true;
	}
}
int calcCount(List<Integer> marksGot) {
	count = 0;
	
	
		marksGot.forEach(m->{if(m<24) {
			count = count+1;
		}
		
		
	});
		if(count>=2) {
			return 2;
		}
		else if (count==1){
			return 1;
		}
		else return 0;
}

@Override
	public String toString() {
		return "Student [id= " + id + ", name= " + name + ", marksGot= " + marksGot + ", Total Marks=" + total + ", No of failed Subjects= " + count + ", Passed= " + result+ "]\n";
	}
	
}
