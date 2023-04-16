package com.example.Task.Entities;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")
public class Students {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")
	private int student_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="date_of_birth")
	private Date date_of_birth;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private long phone_number;
	
	@OneToOne(mappedBy="students")
	private Registrations registrations;
	
	@ManyToMany(mappedBy="students")
	private List<Courses> courses;
	

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public Students(int student_id, String first_name, String last_name, Date date_of_birth, String email,
			long phone_number) {
		super();
		this.student_id = student_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.email = email;
		this.phone_number = phone_number;
	}

	public Students() {
		super();
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(date_of_birth, email, first_name, last_name, phone_number, student_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(date_of_birth, other.date_of_birth) && Objects.equals(email, other.email)
				&& Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name)
				&& phone_number == other.phone_number && student_id == other.student_id;
	}

	@Override
	public String toString() {
		return "Students [student_id=" + student_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", date_of_birth=" + date_of_birth + ", email=" + email + ", phone_number=" + phone_number + "]";
	}	

}
