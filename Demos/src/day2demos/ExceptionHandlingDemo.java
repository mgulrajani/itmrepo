package day2demos;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		try {
		String s =null;
		
		System.out.println(s.length());
		
		int []arr = {1,2,3,4,5};
		
		for(int i = 0;i <6;i++) {
			System.out.println(arr[i]);
			
			
		}}
		catch(NullPointerException npe) {
			System.out.println(npe.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException aib) {
			System.out.println(aib.getMessage());
		}
		catch(Exception e) {
			System.out.println("some exception ...");
		}
		finally {
			
			System.out.println("it is reached in either case");
		}
	}

}
