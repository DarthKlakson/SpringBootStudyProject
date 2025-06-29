package pl.coderslab.springbootstudyproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${coderslab.course.name}")
    private String courseName;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/sample")
    @ResponseBody
    public String sampleProperty() {
        return courseName;
    }
}
