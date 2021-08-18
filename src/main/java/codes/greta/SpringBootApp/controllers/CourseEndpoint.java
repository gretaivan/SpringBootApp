package codes.greta.SpringBootApp.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import codes.greta.SpringBootApp.models.Course;

@RestController
public class CourseEndpoint {

    @CrossOrigin(origins = "*")
    @RequestMapping("/course")
    public Course getEndpoint(@RequestParam(value="name", defaultValue = "Spring Boot", required = false)String name,
                              @RequestParam(value="chapterCount", defaultValue = "2", required = false)int chapterCount){
        return new Course(name, chapterCount);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, value = "/register/course")
    public String saveCourse(@RequestBody Course course) {
        return "Your course named " + course.getName()  + " with " + course.getChapterCount() +  " has been saved successfully!";
    }

}
