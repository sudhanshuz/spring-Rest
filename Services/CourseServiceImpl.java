package com.springRest.demoforRest.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springRest.demoforRest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {

	List<Course>list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"core java","this is java course"));
		list.add(new Course(146,"core spring","this is spring course"));

		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	@Override
	public String removeCourse(int id) {
		// TODO Auto-generated method stub
		for(Course course:list) {
			if(course.getId()==id) {
				list.remove(course);
				return "deleted successfully";
			}
		}
		return "not deleted";
	}

	@Override
	public Course putCourse(Long courseId,String courseTitle,String courseDescription) {
		// TODO Auto-generated method stub
		for(Course course:list) {
			if(course.getId()==courseId) {
				course.setTitle(courseTitle);
				course.setDescription(courseDescription);
				return course;
			}
		}
		return null;
	}

	
}
