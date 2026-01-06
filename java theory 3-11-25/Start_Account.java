public class Start_Account{
	public static void main(String[] args){
		
		//System.out.println("Updated Transaction Limit: " + Account.perDayTransactionLimit); 
		Account a1 = new Account(1111, 200.0);
        Account a2 = new Account(1112, 250.0);
		System.out.println("Before interest");
		a1.show();
		a2.show();
		
		a1.addInterest(10);
		a2.addInterest(5);
		
		
		System.out.println("After interest");
		a1.show();
		a2.show();
		
		// Static variable access করা
        System.out.println("Per Day Transaction Limit: " + Account.perDayTransactionLimit);

        // চাইলে static variable change করা যায় (সব object এর জন্য একসাথে)
        Account.perDayTransactionLimit = 1000;

       System.out.println("Updated Transaction Limit: " + Account.perDayTransactionLimit);
	}
	
}