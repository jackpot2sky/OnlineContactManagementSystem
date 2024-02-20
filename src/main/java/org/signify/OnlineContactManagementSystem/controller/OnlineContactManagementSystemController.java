package org.signify.OnlineContactManagementSystem.controller;

import org.signify.OnlineContactManagementSystem.entity.OnlineContactManagementSystem;
import org.signify.OnlineContactManagementSystem.services.OnlineContactManagementSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OnlineContactManagementSystemController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OnlineContactManagementSystemController.class);

    @Autowired
    private OnlineContactManagementSystemService onlineContactManagementSystemService;

    @PostMapping("/v1/users")
    public OnlineContactManagementSystem saveContactDetails(@RequestBody OnlineContactManagementSystem onlineContactManagementSystem){
        LOGGER.info("Saving contact details: {}", onlineContactManagementSystem);
        return onlineContactManagementSystemService.saveContactDetail(onlineContactManagementSystem);
    }

    @GetMapping("/v1/users/{id}")
    public OnlineContactManagementSystem getAllContactDetailsById(@PathVariable("id") long userId){
        LOGGER.info("Fetching contact details for ID: {}", userId);
        return onlineContactManagementSystemService.getContactDetailById(userId);
    }

    @PutMapping("/v1/users/{id}")
    public OnlineContactManagementSystem updateContactDetails(@PathVariable("id") long userId, @RequestBody OnlineContactManagementSystem onlineContactManagementSystem){
        LOGGER.info("Updating contact details for ID {}: {}", userId, onlineContactManagementSystem);
        return onlineContactManagementSystemService.updateContactDetail(userId, onlineContactManagementSystem);
    }

    @DeleteMapping("/v1/users/{id}")
    public void deleteContactDetailsById(@PathVariable("id") long userId){
        LOGGER.info("Deleting contact details for ID: {}", userId);
        onlineContactManagementSystemService.deleteContactDetailById(userId);
    }
}