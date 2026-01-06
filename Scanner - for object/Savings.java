public class Savings extends Account{
	private float interestRate;
	
	public Savings(){
		super();
		System.out.println("E-Constructor of Savings");
	}
	public Savings(int accountNumber, String accountHolderName, double balance, float interestRate){
		super(accountNumber,accountHolderName,balance);
		System.out.println("P-Constructor of Savings");
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(float interestRate){
		this.interestRate = interestRate;
	}
	
	public float getInterestRate(){
		return interestRate;
	}
	
	public void deposit(float amount){
		if(amount>0){
			balance += amount;
		}
		else{
			System.out.println(amount+" is Invalid Deposit Amount");
		}
	}
	public void withdraw(float amount){
		if(balance-500>=amount && amount>0 && amount%500 == 0){
			balance -= amount;
		}
		else{
			System.out.println(amount+" is Invalid Withdraw Amount");
		}
	}
	
	public void showSavings(){
		//super.showDetails();
		System.out.println("-------Account Information---------");
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Account Name: "+getAccountHolderName());
		System.out.println("Account Balance: "+getBalance());
		System.out.println("Interest Rate: "+interestRate);
		System.out.println("-----------------------------------\n");
	}
}