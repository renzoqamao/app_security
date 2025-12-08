package com.custom.app_security.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.Map;
@RestController
@RequestMapping(path = "/about_us")
public class AboutUsController {
    @GetMapping
    public Map<String, String> aboutus() {
        return Collections.singletonMap("msj", "aboutus");
    }
}
