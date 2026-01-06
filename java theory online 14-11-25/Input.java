import java.lang.*;
import java.util.Scanner;
public class Input{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		//System.out.print("enter 1st number : ");
		float x=sc.nextFloat();
		//System.out.print("enter 2nd number : ");
		float y=sc.nextFloat();
		System.out.println("result:"+x/y);
		
		//Scanner sc1=new Scanner(System.in);
		//System.out.print("enter your name : ");
		String name=sc1.nextLine();
		System.out.println("Name:"+name);
		
		
		float a=sc.nextFloat();
		//System.out.print("enter 2nd number : ");
		float b=sc.nextFloat();
		System.out.println("result:"+(x+y));
		
	}
}