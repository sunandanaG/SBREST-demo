package com.vm.sprinboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vm.sprinboot.entity.Student;
import com.vm.sprinboot.service.StudentService;



@RestController
public class StudentController 
{
	@Autowired
	  StudentService studentService;

	  @RequestMapping("students")
	  public List<Student> getStudents(){

	    return studentService.getStudents();

	  }
	  @RequestMapping("/students/{id}")
	  public Student getStudentByid(@PathVariable("id") int id) {
	    return studentService.getStudentByid(id);
	  }
	  
	  @RequestMapping(method = RequestMethod.POST, value ="students")
	  public void addStudent(@RequestBody Student student) {
	    System.out.println("controllers add student");
	    studentService.addStudent(student);
	  }
	  @RequestMapping(method = RequestMethod.PUT, value = "students/{id}")
	  public void updateStudent(@RequestBody Student student, @PathVariable int id) {
	    studentService.updateStudent(student,id);
	  }
	  @RequestMapping(method = RequestMethod.DELETE, value = "students/{id}")
	  public void deleteStudent(@PathVariable int id) {
	    studentService.removeStudent(id);
	  }
	  
	  
	  @GetMapping("/")
		public String home() {
			return ("<h1>welcome home</h1>");
		}

		@GetMapping("/admin")
		public String admin() {
			return ("<h1>welcome admin</h1>");
		}

		@GetMapping("/user")
		public String user() {
			return ("<h1>welcome user</h1>");
		}
	}