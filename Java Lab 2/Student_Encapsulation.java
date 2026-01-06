class Student_Encapsulation{
	
	private String name;
	private String id;
	private float cgpa;
	private int age;
	
public Student_Encapsulation(){
      System.out.println("Empty constructor");
} 	

public Student_Encapsulation( String name,String id,int age,float cgpa){

 System.out.println("Parameterized constructor");
 
   SetName(name);
   SetId(id);
   SetAge(age);
   SetCgpa(cgpa);

}	

public void SetName(String name){
	this.name=name;
}

public String getName(){
	return name;
}

public void SetId(String id){
	this.id=id;
}

public String getId(){
	return id;
}



public void SetAge(int age){
	if (age>=0)
	    {this.age=age;}
	else 
	   {System.out.println("Age should be positive");}
}

public int getAge(){
	return age;
}

public void SetCgpa(float cgpa){
	if (cgpa>=0 && cgpa<=4)
	            {this.cgpa=cgpa;}
	else 
	{System.out.println("Invalid Cgpa");}		
}

public float getCgpa(){
	return cgpa;
}


	
	
	
public void Show_Info(){

System.out.println("NAME:"+name);
System.out.println("id:"+id);
System.out.println("cgpa:"+cgpa);
System.out.println("age:"+age);
System.out.println("..........");

}	
	
}