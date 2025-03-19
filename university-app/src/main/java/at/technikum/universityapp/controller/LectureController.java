package at.technikum.universityapp.controller;

import at.technikum.universityapp.entity.Lecture;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LectureController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/lectures")
    public List<Lecture> all() {
        return List.of(
                new Lecture("DISYS", "mkosmider", 5),
                new Lecture("SLT", "mkosmider", 2)
        );
    }
}
