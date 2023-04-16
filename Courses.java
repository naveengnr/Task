package com.example.Task.Entities;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="course_id")
	private int course_id;
	
	@Column(name="course_name")
	private String course_name;
	
	@Column(name="course_description")
	private String course_description;
	
	@Column(name="course_code")
	private String course_code;
	
	@ManyToMany
	@JoinColumn(name="student_id")
	private List<Students> students;
	
	@ManyToOne
	@JoinColumn(name="teacher_id")
	private Teachers teachers;

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	public Teachers getTeachers() {
		return teachers;
	}

	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_description() {
		return course_description;
	}

	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}

	public String getCourse_code() {
		return course_code;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}

	

	public Courses() {
		super();
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(course_code, course_description, course_id, course_name, students, teachers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		return Objects.equals(course_code, other.course_code)
				&& Objects.equals(course_description, other.course_description) && course_id == other.course_id
				&& Objects.equals(course_name, other.course_name) && Objects.equals(students, other.students)
				&& Objects.equals(teachers, other.teachers);
	}

	@Override
	public String toString() {
		return "Courses [course_id=" + course_id + ", course_name=" + course_name + ", course_description="
				+ course_description + ", course_code=" + course_code + ", students=" + students + ", teachers="
				+ teachers + "]";
	}

	public Courses(int course_id, String course_name, String course_description, String course_code,
			List<Students> students, Teachers teachers) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_description = course_description;
		this.course_code = course_code;
		this.students = students;
		this.teachers = teachers;
	}

	
	
	
}
