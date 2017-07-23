package com.app.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User Registration Comp.
 */
@Controller
@RequestMapping(value = "/user/registration/comp")
public class UserRegistrationCompController {

    /**
     * display screen.
     *
     * @return view name
     */
    @GetMapping
    public String index() {

        return "comp";
    }
}
