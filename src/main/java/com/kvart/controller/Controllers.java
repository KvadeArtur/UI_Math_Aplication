package com.kvart.controller;

import com.kvart.repo.Repo;
import com.kvart.model.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class Controllers {

    @Autowired
    private Repo repo;

    @GetMapping
    public String get() {

        return "main";
    }

    @GetMapping(value = "/math")
    public String get(Map<String, Object> model) {

        Number number = new Number( 3);

        repo.save(number);

        int value = repo.findById(1).get().getBDNumber();

        model.put("value", value);

        return "math";
    }
}
