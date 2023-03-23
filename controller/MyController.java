package com.springRest.demoforRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.demoforRest.Services.CourseService;
import com.springRest.demoforRest.entities.Course;



@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
@GetMapping("/home")
public String home() {
	return "home page";
}
//get the courses
@GetMapping("/courses")
public List <Course> getCourses(){
	
return this.courseService.getCourses();
}
@GetMapping("/courses/{courseId}")
public Course getCourse(@PathVariable String courseId) {
	return this.courseService.getCourse(Long.parseLong(courseId));
}
@PostMapping("/courses")
public Course addCourse(@RequestBody Course course) {
	return this.courseService.addCourse(course);
}
@DeleteMapping("/courses/{courseId}")
public String deleteCourse(@PathVariable String courseId) {
	return this.courseService.removeCourse(Integer.parseInt(courseId));
}
@PutMapping("/courses/{courseId}/{courseTitle}/{courseDescription}")
public Course updateCourse(@PathVariable String courseId,@PathVariable String courseTitle,@PathVariable String courseDescription) {
	return this.courseService.putCourse(Long.parseLong(courseId),courseTitle,courseDescription);
}
}
