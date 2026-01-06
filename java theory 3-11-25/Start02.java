public class Start02{
	public static void main(String[]args){
	
	Object.studentCount=69;	
	System.out.println("student number: "+Object.studentCount);	
	Object c1=new Object();
	c1.SetName("tohidur");
	c1.SetAge(22);
	c1.SetId("25-60590-1");
	c1.SetCgpa(3.6f);
	c1.show_info();
	System.out.println("student number: "+Object.studentCount);	
	
	Object c2=new Object("ni7","22-234-1",22,3.8f);
	c2.show_info();
	
	System.out.println("student number: "+Object.studentCount);
	
	}
}