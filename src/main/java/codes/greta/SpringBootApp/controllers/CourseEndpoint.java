package codes.greta.SpringBootApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import codes.greta.SpringBootApp.models.Course;
@RestController
public class CourseEndpoint {

    @RequestMapping("/course")
    public Course getEndpoint(@RequestParam(value="name", defaultValue = "Spring Boot", required = false)String name,
                              @RequestParam(value="chapterCount", defaultValue = "2", required = false)int chapterCount){
        return new Course(name, chapterCount);
    }

}
