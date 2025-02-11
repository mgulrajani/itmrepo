package day2demos;

public class Airtel implements Sim,Callable,NewSim{

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Airtel data");
		
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Airtel calling");
	}

	@Override
	public String call() {
		// TODO Auto-generated method stub
		return "hello Airtel";
	}

	@Override
	public void internationalCalling() {
		System.out.println("international calling");
		
	}

}
