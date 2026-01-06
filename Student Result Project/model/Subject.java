
package model;

public class Subject {
	private String code;
	private String title;
	private double credit;
	private double marks;

	public Subject(String code, String title, double credit) {
		this.code = code;
		this.title = title;
		this.credit = credit;
		this.marks = 0;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getCredit() {
		return credit;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}

	public double getGradePoint() {
		double m = this.marks;
		if (m >= 90) {
			return 4.00;
		} else if (m >= 85) {
			return 3.75;
		} else if (m >= 80) {
			return 3.50;
		} else if (m >= 75) {
			return 3.25;
		} else if (m >= 70) {
			return 3.00;
		} else if (m >= 65) {
			return 2.75;
		} else if (m >= 60) {
			return 2.50;
		} else if (m >= 55) {
			return 2.25;
		} else if (m >= 50) {
			return 2.00;
		} else {
			return 0.00;
		}
	}

	public String getGradeLetter() {
		double gp = getGradePoint();
		if (gp == 4.00) {
			return "A+";
		} else if (gp == 3.75) {
			return "A";
		} else if (gp == 3.50) {
			return "A-";
		} else if (gp == 3.25) {
			return "B+";
		} else if (gp == 3.00) {
			return "B";
		} else if (gp == 2.75) {
			return "B-";
		} else if (gp == 2.50) {
			return "C+";
		} else if (gp == 2.25) {
			return "C";
		} else if (gp == 2.00) {
			return "D";
		} else {
			return "F";
		}
	}

	public String getSubject() {
		String data = "";
		data += "Code   : " + code + "\n";
		data += "Title  : " + title + "\n";
		data += "Credit : " + credit + "\n";
		data += "Marks  : " + marks + "\n";
		data += "Grade  : " + getGradeLetter() + "\n";
		data += "GP     : " + String.format("%.2f", getGradePoint()) + "\n";
		data += "-------------------------\n";
		return data;
	}

}
