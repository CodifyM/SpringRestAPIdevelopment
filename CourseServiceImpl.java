package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService{
	List<Course> listVariable;
	
	public CourseServiceImpl() {
		listVariable = new ArrayList<>();
		listVariable.add(new Course(145, "Java Core Course","This course is for beginners"));
		listVariable.add(new Course(3485, "Spring Boot","Creating REST API using spring boot"));
	}

	
	@Override
	public List<Course> getCourses() {
		return listVariable;
	}


	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:listVariable) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		listVariable.add(course);
		return course;
	}
	

}


















