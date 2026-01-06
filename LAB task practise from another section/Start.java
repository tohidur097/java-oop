public class Start{
	public static void main(String[]args){
		
		Account a1=new Account();
		a1.SetAccountNumber(1234532);
		a1.SetAccountHolderName("tohidur");
		a1.SetBalance(12097.00);
		a1.showDetails();
		
		//Account a2=new Account(3214,"tohidur",34567.9);
		//a2.showDetails();
		
	}
}