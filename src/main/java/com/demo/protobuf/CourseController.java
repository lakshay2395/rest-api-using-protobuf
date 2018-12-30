package com.demo.protobuf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.protobuf.BaeldungTraining.Course;

@RestController
public class CourseController {
	
	@Autowired
	CourseRepository courseRepository;
	
	@RequestMapping("/courses/{id}")
	public Course getCourse(@PathVariable Integer id) {
		return courseRepository.getCourse(id);
	}

}
