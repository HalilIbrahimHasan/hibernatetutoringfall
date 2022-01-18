package h01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity  // @Entity annotation is used to make/ convert a class to a table
@Table(name="students_table") //This means you change your class name to a new name in Database table
public class Student01 {
	
	/*
	 * POJO: Plain Old Java Object
	 * private variables
	 * constructors  => non prameterized one with params
	 * getters and setters
	 * toString
	 * 
	 */
	@Id  //when we use id annotation, we make this variable a primary key in our table
	private int student_id;
	@Column(name="student_name") // This will change the name of your variable as a new name in table
	private String name;
	//@Transient   //This will skip this column name for Database table
	private int grade;
	
	public Student01() {
		
	}

	public Student01(int student_id, String name, int grade) {
		
		this.student_id = student_id;
		this.name = name;
		this.grade = grade;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student01 [student_id=" + student_id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
	
	

}
