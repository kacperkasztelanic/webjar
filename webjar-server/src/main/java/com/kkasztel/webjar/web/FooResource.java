package com.kkasztel.webjar.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/foo")
public class FooResource {

    @GetMapping("/foo")
    public String foo() {
        return "foo";
    }
}
