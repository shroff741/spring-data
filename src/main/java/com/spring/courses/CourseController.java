package com.spring.courses;

import com.spring.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> courses(@PathVariable int topicId){
        return courseService.getAllCourses(topicId);
    }
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourseById(@PathVariable int id){
        return courseService.getCourse(id);
    }
    @RequestMapping(value="/topics/{topicId}/courses",method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course,@PathVariable int topicId){
        Topic topic = new Topic(topicId,"","");
        course.setTopic(topic);
        courseService.addCourse(course);
    }
    @RequestMapping(value="/topics/{topicId}/courses/{id}",method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course, @PathVariable int topicId){
        Topic topic = new Topic(topicId,"","");
        course.setTopic(topic);
        courseService.updateCourse(course);
    }
    @RequestMapping(value="/topics/{topicsId}/courses/{id}",method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable int id){
        courseService.deleteCourse(id);
    }
}
