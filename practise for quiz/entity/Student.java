package entity;
public class Student{
    private String name;
    private String id;
    private double cgpa;

public Student(String name,String id,double cgpa){
    setName(name);
    setId(id);
    setCgpa(cgpa);
}
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
public void setId(String id){
    this.id=id;
}
public String getId(){
    return id;
}
public void setCgpa(double cgpa){
    this.cgpa=cgpa;
}
public double getCgpa(){
    return cgpa;
}
public void showStudent(){
    System.out.println("Name : "+name);
    System.out.println("Id : "+id);
    System.out.println("CGPA : "+cgpa);
}


}
