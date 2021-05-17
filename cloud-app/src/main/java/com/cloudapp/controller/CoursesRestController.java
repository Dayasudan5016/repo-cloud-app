package com.cloudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cloudapp.entity.Courses;
import com.cloudapp.service.CoursesService;

@RestController
@RequestMapping("/api")
public class CoursesRestController {
	
	private CoursesService coursesService;
	
	@Autowired
	public CoursesRestController(CoursesService theCoursesService) {
		coursesService=theCoursesService;
	}
	
	@GetMapping("/courses")
	public List<Courses> findAll(){
		return coursesService.findAll();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourses(@PathVariable int courseId){
		
		Courses theCourses=coursesService.findById(courseId);
		if(theCourses==null) {
			throw new RuntimeException("Course id not found- "+courseId);
		}
		
		return theCourses;
	}
	
	@PostMapping("/courses")
	public Courses addCourses(@RequestBody Courses theCourses) {
		
		theCourses.setId(0);
		coursesService.save(theCourses);
		return theCourses;
	}
	
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses theCourses) {
	
		coursesService.save(theCourses);
		return theCourses;
	}
	
	@DeleteMapping("/courses/{courseId}")
	public String deleteCourses(@PathVariable int courseId){
		
		Courses theCourses=coursesService.findById(courseId);
		if(theCourses==null) {
			throw new RuntimeException("Course id not found- "+courseId);
		}
		
		coursesService.deleteById(courseId);
		return "Deleted course id-"+courseId;
	}
}
