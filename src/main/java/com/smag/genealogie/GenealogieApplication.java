package com.smag.genealogie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class GenealogieApplication extends SpringBootServletInitializer {
    /*
        for bootstraping the app
    */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
    /*
    the first called method 
    */
    public static void main(String[] args) {
        SpringApplication.run(GenealogieApplication.class, args)
    }
}
