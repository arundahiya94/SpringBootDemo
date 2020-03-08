package com.boot.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boot.student.dal.entities.Student;
import com.boot.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	StudentRepository studentrepository;

	/*
	 * @Test void contextLoads() { }
	 */

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("Java");
		student.setFee(30d);

		studentrepository.save(student);
	}

	@Test
	public void testReadStudent() {
		Optional<Student> student = studentrepository.findById(1L);
		System.out.println(student);
	}

	@Test
	public void testUpdateStudent() {
		Optional<Student> student = studentrepository.findById(1L);
		Student st = student.get();
		st.setFee(40d);

		studentrepository.save(st);
	}

	@Test
	public void testDeleteStudent() {
		studentrepository.deleteById(1L);
	}

}
