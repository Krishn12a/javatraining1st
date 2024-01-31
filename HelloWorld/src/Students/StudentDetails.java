package Students;

import javax.naming.spi.DirStateFactory.Result;

public class StudentDetails {
	private String sfname;
	private String slname;
	private String gender;
	private int java;
	private int web;
	private int database;
//	int totalmark = 0;
//	int percentage = 0;

	// Setter methods

	public void setFname(String sfname) {
		this.sfname = sfname;
	}

	public void setLname(String slname) {
		this.slname = slname;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public void setDtabase(int database) {
		this.database = database;
	}

	// Getter methods

	public String getFname() {
		return sfname;
	}

	public String getLname() {
		return slname;
	}

	public String getGender() {
		return gender;
	}

	public int getJava() {
		return java;
	}

	public int getWeb() {
		return web;
	}

	public int getDatabase() {
		return database;
	}

	public int totalMarks() {
		int totalmark = this.getJava() + this.getWeb() + this.getDatabase();
		return totalmark;
	}

	public int percentage() {
		int percent = (totalMarks()*100)/300;
		return percent;
		

	}

	public String grade() {
		String grade;
		if (percentage() > 75) {
			 grade="Platinum";
		} else if (percentage()> 65 && percentage() <= 75) {
			 grade="Gold";
		} else if (percentage() > 55 && percentage() <= 65) {
			 grade="Silver";
		} else if (percentage()> 45 && percentage() <= 55) {
			 grade="Bronze";
		} else {
			 grade="No batch";
		}
		
		return grade;
	}

	public void result() {
		System.out.println("\n..........Student Details...........\nStudent Name:" + this.sfname + " " + this.slname
				+ "\n..........Student marks.......\nJava : " + this.java + "\nWeb : " + this.web + "\nDatabase : "
				+ this.database + "\nTotal Marks : " + totalMarks() + "\nPercentage : " + percentage()+"\nGrade : "+grade());

	}
}
