package com.piris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "this is my first spring boot application";
    }

    @RequestMapping("/hello")
    public String helloPage() {
        return "pages/hello.html";
    }

    @RequestMapping("/registration")
    public String getRegistrationPage() {
        return "pages/registrationpage.html";
    }

    @RequestMapping("/clients")
    public String getClientsListPage() {
        return "pages/clientspage.html";
    }

    @RequestMapping("/clientinfo")
    public String getClientInfoPage() {
        return "pages/clientinfo.html";
    }
}
