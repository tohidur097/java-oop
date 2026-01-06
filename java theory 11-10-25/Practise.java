import java.lang.*;
public class Practise{
	public static void main(String[] args){
		String s1="Hello";
		String s2=new String("Hello");
		String s3="Hello";
		String s4=new String("Hello");
		
		/*System.out.println(s1);		// Hello 
		
		s1="hello";
		s3=s1;
		System.out.println("1st:"+s3);		//hello
		System.out.println("2nd:"+s1);		//hello
		
		s4=s1;
		System.out.println("3rd:"+s4);*/		//Hello
		
		
		String s5="Hello world";
		
		System.out.println(s5.length());	//11
		
		System.out.println(s5.charAt(6));		//w
		System.out.println(s5.charAt(5));		//" "
		System.out.println(s5.charAt(10));		//d
		
		System.out.println(s5.indexOf('w'));	//6
		
		System.out.println(s5.indexOf('x'));	//-1
		
		System.out.println(s5.indexOf("rld"));	//8
		
		System.out.println(s5.indexOf("Hello"));	//0
		
		System.out.println(s5.indexOf(" "));	//5
		
		

		
		System.out.println(s5.toUpperCase() );	//HELLO WORLD
		System.out.println(s5);					//Hello world
		System.out.println(s5.toUpperCase().indexOf('L')); //2             0=H 1=E 2=L
		
		
		System.out.println(s5);					//Hello World
		
		
		System.out.println(s5.substring(5));		//" World" 5 soho baki jah ache [0=H] [1=e] [2=l] [3=l] [4=o] [5= ] [6=W] [7=o]  [8=r]  [9=l]  [10=d] 
		System.out.println(s5.substring(6,8));		//wo             6 soho  8 bad
		System.out.println(s5.substring(5,8));		//" wo"
		
		System.out.println(s5.substring(0,11));		//Hello World  
		
		System.out.println(s5.concat(" of java"));	//Hello World of java 
		System.out.println(s5+(" of java"));		//Hello World 
		
		String s6="";
		String s7=" ";
		
		System.out.println();				//  
		System.out.println(s6.isEmpty());	//true
		System.out.println(s7.isEmpty());	//false
		
		String email="karim@student.aiub.edu";
		System.out.println(email.substring(0,5));		//karim
		System.out.println(email.substring(5));		//@student.aiub.edu [5 soho er por theke count hobe]
		
		String email2="rahim.karim@student.aiub.edu";
		System.out.println(email2.substring(0,email2.indexOf('@')));	//rahim.karim
		
		
		String s9 = "Tohidur Rahman";         //   important
		String s10 ="Tohidur";
		System.out.println(s10.compareTo(s9)); 	//jei khane difference  pabe theme jabe ae ASCII valu niye deal korbe  [s10] s=115   [s9] T=84 now 115-84=31 
		System.out.println(s9.compareTo(s10));
						
								
									//A =65 Z=90 
									//a=97 z=122

		  
		
	String s ="Bangladesh";

System.out.println(s.length());           // 10
System.out.println(s.charAt(5));          // 'a'
System.out.println(s.indexOf('a'));       // 1
System.out.println(s.indexOf("desh"));    // 6
System.out.println(s.substring(3, 8));    // "glade"



String w = "HelloJava";

System.out.println(w.substring(0, w.indexOf('J')));
System.out.println(w.substring(w.indexOf('J')));

	String s99 =  "ABCefghij";
		String s100 = "ABC";
		System.out.println(s100.compareTo(s99));  //-6

	
	
	
	}
}





















