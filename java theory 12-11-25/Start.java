import java.lang.*;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Account Holder Name: ");
        String accName = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        float balance = sc.nextFloat();

		System.out.print("Enter Account IRate: ");
        float iRate = sc.nextFloat();      

		System.out.print("Enter Tenure Year: ");
        int year = sc.nextInt();

        Savings s1 = new Savings();
		FixedDeposit s2 = new FixedDeposit();    // mone rakha lagbe 
		
		
        s1.setAccountNumber(accNo);
        s1.setAccountHolderName(accName);
        s1.setBalance(balance);
		s1.setInterestRate(iRate);
		s2.setTenureYear(year);
		s1.showSavings();
		s2.showFixedDeposit();
    }
}
	
	
	/*{
	Account a1=new Account(111,"karim",25000);
	//a1.showDetails(); 
	
	Savings s1=new Savings();
	//s1.showSavings();
	
	Savings s2=new Savings(222,"rahim",30000,7.5f);
	//s2.showSavings();
	
	s2.deposite(10000);	//update 1
	//s2.showSavings(); 
	s2.withdraw(39000);	//update 2
	//s2.showSavings(); 
	FixedDeposit fd1=new FixedDeposit(333,"jamal",200000,5);
	//fd1.showFixedDeposit();
	
	Savings s3=new Savings(555,"kamal",30000,5.5f);
	//s3.showSavings();
	
	Savings s4=new Savings();
	//s4.showSavings();
	
	a1.showDetails();  //1
	s1.showSavings();	//4
	s2.showSavings();	//5
	fd1.showFixedDeposit();//6
	s3.showSavings();	//7
	s4.showSavings();	//8
	
	}
}*/




/*{Account a1=new Account(111,"karim",25000);
	a1.showDetails(); //1
	
	Savings s1=new Savings();
	s1.showSavings();//2
	
	Savings s2=new Savings(222,"rahim",30000,7.5f);
	s2.showSavings();//3
	
	s2.deposite(10000);
	s2.showSavings(); //4
	s2.withdraw(39000);
	s2.showSavings(); //5
	FixedDeposit fd1=new FixedDeposit(333,"jamal",200000,5);
	fd1.showFixedDeposit();//6
	
	Savings s3=new Savings(555,"kamal",30000,5.5f);
	s3.showSavings();//7
	
	//Savings s4=new Savings();
	//s4.showSavings();
	}
	
	}*/
	
	