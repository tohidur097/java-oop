import java.lang.*;
public class Arry_String01{
	public static void main(String[]args){

		String s[]=new String[]{"One","Two","Three","Four","Five"};
		
		for(int i=0;i<s.length;i++){
			//if(s[i].indexOf("o")>=0)
			if(s[i].toUpperCase().indexOf("O")>=0)
			
			{
			System.out.println(s[i]+":"+s[i].length());
			
		}
		
		}
		
		String [] lines =new String[3];
		lines[0]="This is abcd a Line 00001";
		lines[1]="This is a  Line 1000";
		lines[2]="This is not a Line 001000";
		
		for(int i=0;i<lines.length;i++){
			//if (lines[i].substring(9)){
			//System.out.println(lines[i].substring(0,lines[i].indexOf("L")));
			
			System.out.println(lines[i].substring(lines[i].indexOf("L")));
		}		
		//}
		
		
		
		
	}
}