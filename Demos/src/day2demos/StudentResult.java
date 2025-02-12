package day2demos;

public class StudentResult {
	
	private int id;
	private int studentId;
	private int subjectId;
	private double marks;
	@Override
	public String toString() {
		return "StudentResult [id=" + id + ", studentId=" + studentId + ", subjectId=" + subjectId + ", marks=" + marks
				+ "]";
	}
	public StudentResult(int id, int studentId, int subjectId, double marks) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.marks = marks;
	}
	
	
	public void printDetails() throws FailException{
		if (marks < 70) {
			throw new FailException("Minimum marks needed are 70");
			
		}
		
	}
	
	

}
