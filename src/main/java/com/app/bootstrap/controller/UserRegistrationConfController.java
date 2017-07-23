package com.app.bootstrap.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.bootstrap.entity.User;
import com.app.bootstrap.form.UserRegistrationForm;
import com.app.bootstrap.service.UserRegistrationService;

/**
 * User Registration Conf.
 */
@Controller
@RequestMapping(value = "/user/registration/conf")
public class UserRegistrationConfController {

    @Autowired
    HttpSession session;

    @Autowired
    UserRegistrationService userRegistrationService;

    /**
     * display screen.
     *
     * @param attr userRegistrationForm
     * @param model Model
     * @return view name
     */
    @GetMapping
    public String index(@ModelAttribute("userRegistrationForm") UserRegistrationForm attr,
                    Model model) {

        model.addAttribute("form", attr);
        session.setAttribute("attr", attr);
        return "conf";
    }

    /**
     * to registration complete.
     *
     * @param model Model
     * @return view name
     */
    @PostMapping(params = "comp")
    public String conf(Model model) {

        UserRegistrationForm form = (UserRegistrationForm) session.getAttribute("attr");
        User user = new User();
        user.setUserName(form.getUserName());
        user.setEmail(form.getEmail());
        user.setPassword(form.getPassword());

        try {

            userRegistrationService.save(user);
        } catch (Exception e) {

            model.addAttribute("form", form);
            model.addAttribute("message", "ユーザの登録処理でエラーが発生しました。");
            return "conf";
        }

        session.invalidate();
        return "redirect:/user/registration/comp";
    }
}
