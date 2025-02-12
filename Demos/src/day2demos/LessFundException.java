package day2demos;

public class LessFundException extends Exception {
	//instance variable
	private String message;

	//constructor
	public LessFundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
