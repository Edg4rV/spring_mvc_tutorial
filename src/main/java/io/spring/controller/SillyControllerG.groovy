package io.spring.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class SillyControllerG {


    @RequestMapping("/showGroovy")
    String displayTheForm() {
        return "apache-groovy"
    }



}
