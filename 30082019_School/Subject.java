
public class Subject {
	int id;
	String name;
	int minMark;
	int maxMark;
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
	public int getMinMark() {
		return minMark;
	}
	public void setMinMark(int minMark) {
		this.minMark = minMark;
	}
	public int getMaxMark() {
		return maxMark;
	}
	public void setMaxMark(int maxMark) {
		this.maxMark = maxMark;
	}
	public Subject(int id, String name, int minMark, int maxMark) {
		super();
		this.id = id;
		this.name = name;
		this.minMark = minMark;
		this.maxMark = maxMark;
	}

	public Subject() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", minMark=" + minMark + ", maxMark= " + maxMark +"]\n";
	}
	
}
