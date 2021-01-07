package com.tts.task.controller;

import com.tts.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    TaskService taskService;

    // http://localhost:8080/remDupl/aabbccdd
    @RequestMapping(path = "/remDupl/{input}")
    public String removingDuplicates(@PathVariable(name = "input") String input){
        return taskService.removeDuplicates(input);
    }
}
