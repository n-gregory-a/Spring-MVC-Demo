package gn.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        // create a new student object
        Student student = new Student();

        // add student object to the model
        model.addAttribute("student", student);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processorForm(@ModelAttribute("student") Student student) {

        // log the input data
        System.out.println("student: " + student.getFirstName() +
                " " + student.getLastName());
        return "student-conformation";
    }
}
