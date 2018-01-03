package com.github.wjoz.microservicesExampleMessageService.restClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("http://user-service")
public interface UserClient {
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    String getUsers();
}
