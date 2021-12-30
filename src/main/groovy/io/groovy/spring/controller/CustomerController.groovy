package io.groovy.spring.controller

import io.groovy.spring.model.Customer
import org.springframework.beans.propertyeditors.StringTrimmerEditor
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.InitBinder
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

import javax.validation.Valid


@Controller
@RequestMapping("/customer")
class CustomerController {


    @InitBinder
    void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true)

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor)
    }


    @RequestMapping("/showForm")
    String showForm(Model theModel) {

        theModel.addAttribute("customer", new Customer())

        return "customer-form"

    }

    @RequestMapping("/processForm")
    String processForm (
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult) {


        println "Last name: |" + theCustomer.getLastName() + "|"


        println theBindingResult.hasErrors()

        if (theBindingResult.hasErrors()) {
            return "customer-form"
        } else {
        return "customer-confirmation"
        }
    }


}
