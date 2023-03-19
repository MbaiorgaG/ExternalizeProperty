package com.sdl.externalizeproperty.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class ApplicationService {

    private Logger logger = LoggerFactory.getLogger(ApplicationService.class);
    @Value("${app.author.name}")
    private String authorName;
    @Value("${app.author.email}")
    private String authorEmail;
    public void displayAppName(){
      logger.info("Application author name: {} and email: {}", authorName, authorEmail);
    }


}
