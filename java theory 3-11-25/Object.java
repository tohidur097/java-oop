public class Object{   //encapsulation for class and object 

  //private field for encapsulation 
 
private String name;
private String id;
private int age;
private float cgpa;

public static int studentCount; 
	
	public Object(){
		System.out.println("Empty constructor");
		studentCount--;
	}
//parameterized constructor with name,id,cgpa,age	
	
	public Object(String name,String id,int age,float cgpa){
		System.out.println("parameterized constructor");
		//set the value using setter method
		SetName(name);
		SetId(id);
		SetAge(age);
		SetCgpa(cgpa);
	
	studentCount++;
		
	}
	
	//setter method for name

	public void SetName(String name){
		this.name=name;
	}
	
	//getter method for name 
	public String getName(){
	return name;}
	
	//setter method for id
	public void SetId(String id){
		this.id=id;
	}
	
	//getter method for id 
	public String getId(){
	return id;}
	
	//setter method for age
	public void SetAge(int age){
		
		if(age>=0)
		{this.age=age;}
	else 
	   {System.out.println("Age should be positive");}
		
	}
	
	//getter method for age 
	public int getAge(){
	return age;}
	
	
	
	
	//setter method for cgpa 
	
	public void SetCgpa(float cgpa){
		if(cgpa>=0 && cgpa<=4)
		{this.cgpa=cgpa;}
	else 
	{System.out.println("cgpge invalid");}
		
	}
	
	//getter method for cgpa
	public float getCgpa(){
	return cgpa;}
	
//public static int studentCount; //eita je khanei dei na keno kuno somossa nei jotokhn na main a call kori 
	public void show_info(){
		
		System.out.println("...................");
		System.out.println ("ID: "+id );
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("------------------");	
	}
	
	
}