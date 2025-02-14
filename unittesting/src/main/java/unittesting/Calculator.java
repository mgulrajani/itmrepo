package unittesting;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int divide(int a,int b) throws IllegalArgumentException{
		if(b==0) {
			throw new IllegalArgumentException();
		}
		return 0;
		
	}

}
