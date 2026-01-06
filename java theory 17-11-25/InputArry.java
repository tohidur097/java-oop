import java.lang.*;
import java.util.Scanner;
public class InputArry{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of N:");
		int size=sc.nextInt();
		
		int num[]=new int[size];
		System.out.print("Enter number for arry: ");
		
		for(int i=0;i<num.length;i++){
			num[i]=sc.nextInt();
		}
		
		System.out.println("here this arry: ");
		
		for(int i=0;i<num.length;i++){
		System.out.print(num[i]+" ");	
		}
		System.out.println(" ");
		
		int sum=0;
		for(int i=0;i<num.length;i++){
			sum=sum+num[i];
		}
		System.out.println("Sum="+sum);
		
		
		int avg=0;
		avg=sum/num.length;
		System.out.println("avg="+avg);
	
	}
}
 