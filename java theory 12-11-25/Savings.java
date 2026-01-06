public class Savings extends Account{
	private float interestRate;
	public Savings(){
		super();                 //parents class [Account class] er empty constructor call korlam
		System.out.println("Empty Constructor of savings child class");
	}
	
	public Savings(int accountNumber,String accountHolderName,double balance,float interestRate){
		super(accountNumber,accountHolderName,balance); //constructor call of parent/super class
		System.out.println("p-constructor savings child class");
		this.interestRate=interestRate;  //eita na dile interestrate =0.0 ashe 
	}
	
	public void setInterestRate(float interestRate){
		if(interestRate>=0){
			this.interestRate=interestRate;
		}
		else{
			System.out.println("Invalid Interest Rate child class");
		}
	}
	
	public float getInterestRate(){
		return interestRate;
	}
	public void deposite(double amount){
		if(amount>0){
			balance+=amount;
		}
	}
	
	public void withdraw (double amount){
		if(balance-500>=amount && amount >0){
			balance-=amount;
			System.out.println("successfully withdraw:"+amount);
		}
		else{
			System.out.println("invalid amount");
		}
	}
		public void showSavings(){
		//showDetails();
		System.out.println("-------Account chlid class  Information---------");
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Account Name: "+getAccountHolderName());
		System.out.println("Account Balance: "+getBalance());
		System.out.println("Interest Rate: "+interestRate);
		System.out.println("-----------------------------------\n");
	}
	
}
			