package day2demos;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Sim sim = null;
		
		System.out.println("1. Airtel");
		System.out.println("2. Jio");
		System.out.println("3. Voda");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice of vendor");
		
		int simChoice =  scanner.nextInt();
		
		switch(simChoice) {
		case 1:
			sim = new Airtel();break;
		
		case 2:
			sim = new Jio();break;
		case 3:
			sim = new Voda();break;
		default:
			System.out.println("Invalid choice");
		}
		sim.calling();
		sim.data();
		
		
	}

}
