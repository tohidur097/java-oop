public class Account{
	private int accountNo;
	private double balance;
	
	public static double perDayTransactionLimit= 500;
	
	public Account(){

		}
		
		
	public Account(int an, double b){
		accountNo = an;
		balance = b;
	}
	public void addInterest(double rate){
		balance  = balance + (balance * rate /100);
	}
	public void show( ){
		System.out.println("AccountNo: "+ accountNo);
		System.out.println("Balance: "+ balance);
		System.out.println("..............");
	}
}
