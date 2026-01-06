package model;
public class Result{
	private String studentId;
	private Subject subjects[];
	
	public Result(){
		subjects = new Subject[100]; 
	}
	public Result(String studentId,int totalSubjects){
		this.studentId=studentId;
		subjects = new Subject[totalSubjects];
	}
	public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
	public void insertSubject(int pos,Subject s){
		if(pos>=0 && pos < subjects.length){
			subjects[pos]=s;
		}
		else{
			System.out.println("Invalid subject position");
		}
	}
	
	public void removeSubject(int pos){
		if(pos >=0 && pos < subjects.length){
			subjects[pos]=null;
		}
		System.out.println("Remove Subject number: "+pos);
	}
	
	public Subject getSubject(int pos){
		if(pos >=0 && pos < subjects.length){
			return subjects[pos];
		}
		else{
			return null;
		}
	}
	
	public double calculateGPA(){
		double total=0;
		int count=0;
		for(int i=0;i<subjects.length;i++){
			if (subjects[i] != null) {
				total=total+subjects[i].getGradePoint();
				count++;
			}
		}
		if(count==0){
			return 0;
		}
			return total/count;
		}
	
	
public void showResult(){
    System.out.println("Student ID: " + studentId);
    System.out.println("-----------------------------");

    for(int i = 0; i < subjects.length; i++){
			if(subjects[i] != null){
				System.out.println("Subject: " + i);
				System.out.println("Code  : " + subjects[i].getCode());
				System.out.println("Marks : " + subjects[i].getMarks());
				System.out.println("Grade : " + subjects[i].getGradeLetter());
				System.out.println("-----------------------------");
			}
		}
		System.out.println("GPA: " + calculateGPA());
	}

// GUI তে দেখানোর জন্য full formatted result string
public String getResult() {
    String data = "";
    data += "******** Student ID: " + studentId + " ********\n";

    int count = 0;
    for (int i = 0; i < subjects.length; i++) {
        if (subjects[i] != null) {
            count++;

            data += "~~~~~~~ Subject Slot: " + i + " ~~~~~~~\n";
            data += subjects[i].getSubject(); // Subject-এর formatted string
        }
    }

    data += "+++++++++++++++++++++++++\n";
    data += "Total Subjects : " + count + "\n";
    data += "GPA            : " + String.format("%.2f", calculateGPA()) + "\n";
    data += "*************************\n";

    return data;
}

// GUI table বানাতে array দরকার হলে
public Subject[] getAllSubjects() {
    return subjects;
}


		
	
}

	
		
				
	
			
	
	
		
		
		