package com.app.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * ユーザ登録画面
 */
@Controller
public class UserRegistrationController {

    @RequestMapping(value = "/user/registration", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(new Object());
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
