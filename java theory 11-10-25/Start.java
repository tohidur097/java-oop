import java.lang.*;
public class Start{
	public static void main(String[] args){
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = s1;
		String s4 = new String("Hello World");
		
		System.out.println("Compare Ref.");
		System.out.println(s1==s2);				//true
		System.out.println(s1==s3);	           //true
		System.out.println(s1==s4);				//false 
		
		System.out.println("Compare Value");
		System.out.println(s1.equals(s2));			//true
		System.out.println(s1.equals(s3));			//true
		System.out.println(s1.equals(s4));			//true
		
		String email = "KARim.RAHman123@yahoo.com";
		System.out.println("Length of a String: "+email.length());		//25
		System.out.println("Index Of a Character: "+email.indexOf('@'));	//15  [0 theke counnt hobe]
		System.out.println("Index Of a Character: "+email.indexOf('#'));	//-1
		System.out.println("Index Of a Sub String: "+email.indexOf(".com"));	//21
		System.out.println("Char At Index: "+email.charAt(3));					// i [0 theke count hobe]
		
		String userName = email.substring(0,email.indexOf('@'));				//[KARim.RAHman123]
		String domain = email.substring(email.indexOf('@')+1);			//[yahoo.com]
		System.out.println(userName);		//KARim.RAHman123
		System.out.println(domain);				//yahoo.com
		
		System.out.println(userName.toLowerCase());	//karim.rahim123
		System.out.println(domain.toUpperCase());	//YAHOO.COM
		
		System.out.println(userName); 		//KARim.RAHman123 [eitai thakbe ]
		System.out.println(domain);			//yahoo.com 
		
		String s5 = ""; //empty string
		String s6 = " ";
		
		System.out.println(s5.isEmpty());	//true
		System.out.println(s6.isEmpty());	//false
		
		String s7 = "First";
		String s8= "Second";
		
		System.out.println(s7+" "+s8);	//First Second
		System.out.println(s7.concat(" ").concat(s8));	//First Second
		
		String s9 =  "ABCEFGHIJ";
		String s10 = "ABC";
		System.out.println(s10.compareTo(s9)); 	//-6 
		System.out.println(s9.compareTo(s10));	// 6
		
	}
}