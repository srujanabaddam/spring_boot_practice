package com.cah.spring.web.practice2.practice2;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class Practice2Controller {
    @GetMapping("/getDate")
    public String getDate() {
        return "Hello User !! " + new Date();
    }
}