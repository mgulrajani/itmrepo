package day2demos;

public class BankingApp {
	
	public static void main(String[] args) {
		
		Account a1 = new Account(11L,10000);
		
		try {
			a1.withdrawl(1000);
			System.out.println(a1.getBalance());
		} catch (LessFundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
