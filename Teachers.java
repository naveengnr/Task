package com.example.Task.Entities;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Teachers")
public class Teachers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="teacher_id")
	private int teacherid;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private long phonenumber;
	
	@Column(name="course_id")
	private int courseid;
	
	@OneToMany(mappedBy="teachers")
	@JsonIgnore
	private List<Courses> courses;

	public int getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseid, courses, email, firstname, lastname, phonenumber, teacherid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teachers other = (Teachers) obj;
		return courseid == other.courseid && Objects.equals(courses, other.courses)
				&& Objects.equals(email, other.email) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(lastname, other.lastname) && phonenumber == other.phonenumber
				&& teacherid == other.teacherid;
	}

	@Override
	public String toString() {
		return "Teachers [teacherid=" + teacherid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", phonenumber=" + phonenumber + ", courseid=" + courseid + ", courses=" + courses + "]";
	}

	public Teachers(int teacherid, String firstname, String lastname, String email, long phonenumber, int courseid,
			List<Courses> courses) {
		super();
		this.teacherid = teacherid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.courseid = courseid;
		this.courses = courses;
	}

	public Teachers() {
		super();
	
	}

	
	
	
	
	
}
