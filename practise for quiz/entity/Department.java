package entity;

import entity.Student;

public class Department{
    private String deptName;
    private Student[] students;


    public Department(){
        students=new Student[10];
    }
    public Department(String deptName,int size){
        this.deptName=deptName;
        students= new Student[size];
    }
    public void setDeptName(String deptName){
        this.deptName=deptName;
    }
    public String getDeptName(){
        return deptName;
    }
    public void insertStudent(int pos,Student s){
        if(pos>=0 && pos < students.length){
            students[pos]=s;
        }
        else{
            System.out.println("invalid position");
        }
    }
    public void removeStudent(int pos){
        if(pos>=0 && pos< students.length ){
            students[pos]=null;
            System.out.println("Remove student at position: "+pos);
        }
        else {
            System.out.println("Invalid position");
        }
    }
    public Student getStudent(int pos){
        if(pos>=0 && pos< students.length ){
            return students[pos];
        }
        return null;
    }
    public void updateStudentName(int pos,String newName){
        if(pos>=0 && pos < students.length && students[pos]!=null){
            students[pos].setName(newName);
        }
        else {
            System.out.println ("invalid");
        }
    }

    public void showDetails(){
         System.out.println ("----------------------------");
         System.out.println ("department: "+deptName);
         for(i=0;i<students.length;i++){
            if(students[i]!=null){
                 System.out.println ("Student slot: "+i);
                 students[i].showStudent();
            }
         }
         System.out.println ("----------------------------");


        }



}