package secondProblem;

public class Employee {
	private String name;
	private String department;
	private String id;
	private String position;
	private int score;
	
	public Employee(String name, String department, String id, String position, int score) {
		this.name = name;
		this.department = department;
		this.id = id;
		this.position = position;
		this.setScore(score);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
