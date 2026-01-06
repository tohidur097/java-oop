import java.lang.*;
import java.util.Scanner;
public class Arry_input{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The value of N: ");
		int size=sc.nextInt();
		
		int numbers[]=new int [size];
	    System.out.print("Enter The All number: ");
		
		for( int i=0;i<numbers.length;i++){
			numbers[i]=sc.nextInt();
		}
		
		System.out.println("here your output arry");
		
		for( int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
			
		}
		System.out.println(" ");
		
		System.out.println("here max value");
		int max=numbers[0];
		for( int i=0;i<numbers.length;i++){
			
			if(numbers[i]>max){
			  max=numbers[i];
			}
			
		
		}
		
		System.out.println(max);
		
		
		System.out.println(" ");
		
		System.out.println("here min value");
		int min=numbers[0];
		for( int i=0;i<numbers.length;i++){
			
			if(numbers[i]<min){
			  min=numbers[i];
			}
			
		
		}
		
		System.out.println(min);
		
		
		
		
	}
} 