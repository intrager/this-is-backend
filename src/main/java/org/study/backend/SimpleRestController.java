package org.study.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @RequestMapping("/")
    public String hello() {
        return "hello <strong>Backend</strong>";
    }

    @RequestMapping("/bye")
    public String bye() {
        return "Bye";
    }
}
