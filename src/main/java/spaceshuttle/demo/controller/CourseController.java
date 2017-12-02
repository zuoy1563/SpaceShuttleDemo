package spaceshuttle.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spaceshuttle.demo.repository.CourseRepository;

@Controller
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(path = "/all")
    public String getAllCourses(ModelMap map) {
        map.addAttribute("coursesList", courseRepository.findAll());
        return "/courses/all";
    }
}
