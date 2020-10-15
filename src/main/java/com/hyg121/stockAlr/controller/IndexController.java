package com.hyg121.stockAlr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showTopPage() {
        return "index";
    }
}