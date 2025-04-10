package at.technikum.universityapp.controller;

import at.technikum.universityapp.entity.Lecture;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@RestController
public class LectureController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/lectures")
    public List<Lecture> all(@RequestParam LocalDateTime start) {
        return List.of(
                new Lecture("DISYS", "mkosmider", 5),
                new Lecture("SLT", "mkosmider", 2)
        );
    }

    @GetMapping("/lectures/{id}")
    public Lecture read(@PathVariable int id) {
        return new Lecture("DISYS", "mkosmider", 5);
    }

    @GetMapping("/lectures/count")
    public int count() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
