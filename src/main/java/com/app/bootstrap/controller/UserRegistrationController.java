package com.app.bootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.bootstrap.form.UserRegistrationForm;
import com.app.bootstrap.service.UserRegistrationService;

/**
 * User Registration.
 */
@Controller
@RequestMapping(value = "/user/registration")
public class UserRegistrationController {

    @Autowired
    UserRegistrationService userRegistrationService;

    /**
     * display screen.
     *
     * @param model Model
     * @return view name
     */
    @GetMapping
    public String index(Model model) {
        model.addAttribute("form", new UserRegistrationForm());
        return "index";
    }

    /**
     * to registration confirmation.
     *
     * @param form UserRegistrationForm
     * @param result BindingResult
     * @param redirectAttributes
     * @param model RedirectAttributes
     * @return view name
     */
    @PostMapping(params = "conf")
    public String conf(@ModelAttribute("form") @Validated UserRegistrationForm form,
                    BindingResult result, RedirectAttributes redirectAttributes, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("form", form);
            model.addAttribute("message", "入力された値が不正です。");
            return "index";
        }

        redirectAttributes.addFlashAttribute("userRegistrationForm", form);
        return "redirect:/user/registration/conf";
    }
}
