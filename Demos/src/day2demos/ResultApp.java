package day2demos;

public class ResultApp {
public static void main(String[] args) {
	try {
	StudentResult result  = new StudentResult(1, 100, 33, 69);
	
	result.printDetails();
	}
	catch(FailException fe) {
		System.out.println(fe);
	}
}
}
