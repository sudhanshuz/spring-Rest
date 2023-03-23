package com.springRest.demoforRest.Services;

import java.util.List;

import com.springRest.demoforRest.entities.Course;

public interface CourseService {
	
public List<Course> getCourses();
public Course getCourse(long courseId);
public Course addCourse(Course course);
public String removeCourse(int parseInt);
public Course putCourse(Long courseId,String courseTitle,String CourseDescription);
}
