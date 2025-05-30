//package org.nisum.asutosh.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class HomeController {
//
////    @RequestMapping("/")
////    public ModelAndView defaultPage() {
//////        ModelAndView mav = new ModelAndView("home");
//////        mav.addObject("message", "Hello World from Spring MVC!");
//////        return mav;
////    }
//    @RequestMapping("/home")
//    public ModelAndView home() {
//        ModelAndView mav = new ModelAndView("home");
//        mav.addObject("message", "Hello World from Spring MVC!");
//        return mav;
//    }
//    @RequestMapping("/greet")
//    public ModelAndView greet() {
//        ModelAndView mav = new ModelAndView("greet");
//        mav.addObject("message", "Hello World from Spring MVC!");
//        return mav;
//    }
//    @GetMapping("/gett")
//    public ModelAndView gett() {
//        ModelAndView mav = new ModelAndView("gett");
//        mav.addObject("message", "Hello World from Spring MVC!");
//        return mav;
//    }
//}
package org.nisum.asutosh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class asuHomeController {

    @GetMapping("/")
    public ModelAndView defaultPage() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("message", "Welcome to the default page!");
        return mav;
    }

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("message", "Hello from /home!");
        return mav;
    }

    @GetMapping("/greet")
    public ModelAndView greet() {
        ModelAndView mav = new ModelAndView("greet");
        mav.addObject("message", "Greetings from Spring MVC!");
        return mav;
    }

    // Display form page (GET)
    @GetMapping("/form")
    public ModelAndView showForm() {
        return new ModelAndView("submit"); // submit.jsp
    }

    // Handle form submission (POST)
    @PostMapping("/submit")
    public ModelAndView handleSubmit(@RequestParam("name") String name) {
        ModelAndView mav = new ModelAndView("result");
        mav.addObject("message", "Form submitted successfully! Hello, " + name);
        return mav;
    }
}
