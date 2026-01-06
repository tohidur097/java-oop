package model;

public class Student extends Person {

    private String dept;
    private String batch;

    public Student(String id, String name, String email, String dept, String batch) {
        super(id, name, email);
        this.dept = dept;
        this.batch = batch;
    }

    public String getDept() {
        return dept;
    }

    public String getBatch() {
        return batch;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getStudent() {
        String data = "";
        data += "ID    : " + id + "\n";
        data += "Name  : " + name + "\n";
        data += "Email : " + email + "\n";
        data += "Dept  : " + dept + "\n";
        data += "Batch : " + batch + "\n";
        return data;
    }

    @Override
    public void showInfo() {
        System.out.println(getStudent());
    }
}
