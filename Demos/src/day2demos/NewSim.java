package day2demos;

public interface NewSim extends Sim {
	public void internationalCalling();
	
	public static void setData(String type) {
		System.out.println("setting 5G ....");
	}
	
	public default void m1() {
		System.out.println("this is added to add new features");
	}
}
