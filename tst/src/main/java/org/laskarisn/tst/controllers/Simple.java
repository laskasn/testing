package org.laskarisn.tst.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Simple {

    @RequestMapping("/ping")
    public String index() {
        return "pong";
    }

}