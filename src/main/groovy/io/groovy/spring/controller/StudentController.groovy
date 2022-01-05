package io.groovy.spring.controller

import io.groovy.spring.model.OldStudent
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("/student")
class StudentController {


    @RequestMapping("/showForm")
    String showForm(Model theModel) {

        OldStudent theStudent = new OldStudent()

        theModel.addAttribute("student", theStudent)

        return "student-form"
    }


    @RequestMapping("/processForm")
    String processForm(@ModelAttribute("student") OldStudent theStudent) {

        println "theStudent: ${theStudent.getFirstName()}"
        println "theStudent: ${theStudent.getLastName()} "

        return "student-confirmation"

    }


}
