package com.github.wjoz.microservicesExampleMessageService.controller;

import com.github.wjoz.microservicesExampleMessageService.restClient.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final UserClient userClient;

    @Autowired
    public MessageController(UserClient userClient) {
        this.userClient = userClient;
    }

    @RequestMapping(value = "/messages", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getMessages() {
        return userClient.getUsers();
    }
}
