package com.example.Task.Entities;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Registrations")
public class Registrations {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Registration_id")
	private int Registration_id;
	
	@Column(name="student_id")
	private int student_id;
	
	@Column(name="course_id")
	private int course_id;
	
	@Column(name="Registration_date")
	private Date Registration_date;
	
	@OneToOne
	@JoinColumn(name="student_id", updatable = false ,insertable = false )
    private Students students;
	
	public int getRegistration_id() {
		return Registration_id;
	}

	public void setRegistration_id(int registration_id) {
		Registration_id = registration_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public Date getRegistration_date() {
		return Registration_date;
	}

	public void setRegistration_date(Date registration_date) {
		Registration_date = registration_date;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Registration_date, Registration_id, course_id, student_id, students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registrations other = (Registrations) obj;
		return Objects.equals(Registration_date, other.Registration_date) && Registration_id == other.Registration_id
				&& course_id == other.course_id && student_id == other.student_id
				&& Objects.equals(students, other.students);
	}

	@Override
	public String toString() {
		return "Registration [Registration_id=" + Registration_id + ", student_id=" + student_id + ", course_id="
				+ course_id + ", Registration_date=" + Registration_date + ", students=" + students + "]";
	}

	public Registrations(int registration_id, int student_id, int course_id, Date registration_date, Students students) {
		super();
		Registration_id = registration_id;
		this.student_id = student_id;
		this.course_id = course_id;
		Registration_date = registration_date;
		this.students = students;
	}

	public Registrations() {
		super();
		
	}

	
	
	

}
