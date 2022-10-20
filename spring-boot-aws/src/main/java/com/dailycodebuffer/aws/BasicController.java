package com.dailycodebuffer.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String home() {
        return  "This is the code written by Vishwanath Bagali and is Deployed to AWS EC2 and S3 !!!";
    }
}
