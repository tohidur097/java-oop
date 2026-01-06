public class Start{
	public static void main(String[] args){
		
		Student_Encapsulation s1=new Student_Encapsulation();
		 //s1.Name="tohidur"; 
		 s1.SetName("Tohidur"); 
		 s1.SetId("25-60590-1");
		 s1.SetAge(22);
		 s1.SetCgpa(3.86f);
		 
		 s1.Show_Info();
		 
		 
		Student_Encapsulation s2 = new Student_Encapsulation("korim", "23-11111-1", -21, 3.75f);
		s2.Show_Info();	
		
	}
	
}
