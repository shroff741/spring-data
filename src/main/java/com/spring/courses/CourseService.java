package com.spring.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    public List<Course> getAllCourses(int topicId){
        ArrayList<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(course -> courses.add(course));
        return courses;
     }
    public Course getCourse(int id){
        Optional<Course> oCourse = courseRepository.findById(id);
        Course course = new Course();
        course=null;
        if(oCourse.isPresent()){
            course = oCourse.get();
        }
        return course;
    }
    public void addCourse(Course course){
        courseRepository.save(course);
    }
    public void updateCourse(Course course){
       courseRepository.save(course);
    }
    public void deleteCourse(int id){
        courseRepository.deleteById(id);
    }


}
