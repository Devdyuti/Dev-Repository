package org.dev.ws.tu.controller;

import java.net.URI;
import java.util.List;

import org.dev.ws.tu.model.Course;
import org.dev.ws.tu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@EnableAutoConfiguration
@Configuration
@ComponentScan("org.dev.ws.tu")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("students/{studentId}/courses")
	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId){
		return studentService.retrieveCourses(studentId);
	}
	@GetMapping("students/{studentId}/courses/{courseId}")
	public Course retrieveDetailsForCourse(@PathVariable String studentId, @PathVariable String courseId) {
		return studentService.retrieveCourse(studentId, courseId);
	}
	public ResponseEntity<Void> registerStudentForCourse(@PathVariable String studentId, @RequestBody Course newCourse){
		Course course=studentService.addCourse(studentId, newCourse);
		if(course==null) {
			return ResponseEntity.noContent().build();
		}
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{id}").buildAndExpand(course.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
