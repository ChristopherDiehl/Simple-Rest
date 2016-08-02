package com.shellcoders.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shellcoders.blog.Comment;

@RestController
public class MyRestController {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
	@RequestMapping("/greeting")
    public Comment greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Comment("1",
        					"BIG PAPA",
        					"MY_TEXT",
        					"123123123"
                            );
    }
}
