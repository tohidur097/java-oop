import java.lang.*;
import java.util.Scanner;
public class Start{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Scanner scLine = new Scanner(System.in);
		
		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();
		
		System.out.print("Enter Account Holder Name: ");
		String accName = scLine.nextLine();
		
		System.out.print("Enter Account Balance: ");
		float balance = sc.nextFloat();
		
		System.out.print("Enter Account IRate: ");
		float iRate = sc.nextFloat();
		
		Savings s1 = new Savings();
		s1.setAccountNumber(accNo);
		s1.setAccountHolderName(accName);
		s1.setBalance(balance);
		s1.setInterestRate(iRate);
		s1.showSavings();
		
	}
}