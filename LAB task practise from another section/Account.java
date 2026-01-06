public class Account{
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
 public void SetAccountNumber(int an){
 accountNumber=an;
}	

	
 public int getAccountNumber(){
	return accountNumber;
}

 public void SetAccountHolderName(String ahn){
 accountHolderName=ahn;
}	

	
 public String getAccounHolderName(){
	return accountHolderName;
}

 public void SetBalance(Double b){
 balance=b;
}	

	
 public double getBalance(){
	return balance;
}
	
	public void showDetails(){
		
		System.out.println("Account Number:" +accountNumber);
		System.out.println("Account Holder:" +accountHolderName);
		System.out.println("Account Balance:" +balance);
	}
	
	
	
}