package com.example.Micro;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Course")
public class CourseController {

	@Autowired
	private CourseRepository repo;
	
	@GetMapping("/")
	public String hello(){
		return "wasup";
	}
	@GetMapping("fetchAll")
	public List<Course> fetchAll(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Course getSpecificCourse(@PathVariable BigInteger id) {
		return repo.getOne(id);
	}
	
	@PostMapping("/courses")
	public void saveCourse(@RequestBody Course course) {
		repo.save(course);
	}

	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable BigInteger id) {
		repo.deleteById(id);
	}
	
}
