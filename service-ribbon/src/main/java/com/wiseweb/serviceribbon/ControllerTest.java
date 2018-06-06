package com.wiseweb.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest
{
    @Autowired
    KafkaTest testKafka;

    @RequestMapping(value = "/hi")
    public String test(@RequestParam String name)
    {
        return testKafka.hiService(name);
    }
}
