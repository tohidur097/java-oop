import java.lang.*;
import java.util.Scanner;

public class StringArry{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter total number of fruit:");
		int num=sc.nextInt();
		sc.nextLine();
		String item[]=new String [num];
		
		System.out.println("name of fruits:");
		for(int i=0;i<item.length;i++){
			item[i]=sc.nextLine();
		}
		
		System.out.print("arry of this iteam names: ");
		for(int i=0;i<item.length;i++){
			System.out.print(item[i]+" ");
		}
		
		System.out.println("");
		
		
		System.out.print("which fruits you want?please tell: ");
		String searching_fruits=sc.nextLine();
		
		int present=0;
		for (int i=0;i<item.length;i++){
			if(item[i].equals(searching_fruits)){
				present=1;
			System.out.println(searching_fruits+ " is present at index " +i);
			break;
			}
		}
			
			if(present==0){
				System.out.println(searching_fruits+" is not present");
			}
		
	
	}
 
}