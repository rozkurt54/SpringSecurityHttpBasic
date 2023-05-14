package com.rozkurt.ss_2022_c1_e1.conbtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String string() {
        return "Demo";
    }

}
