package day2demos;

public class Account {
	private long id ;
	private double balance;
	
	public synchronized void  withdrawl(double amtToBeWithdrawn) throws 
	LessFundException {
		if (this.balance < amtToBeWithdrawn)
			throw new LessFundException("Not enough funds");
		this.balance-=amtToBeWithdrawn;
		
		
	}
	
	public long getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public Account(long id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public synchronized void deposit(double amtToBeDeposited) {
		this.balance += amtToBeDeposited;
		
	}

}
