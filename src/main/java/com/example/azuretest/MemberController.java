package com.example.azuretest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/member")
    public String member() {
        return "member";
    }
}
