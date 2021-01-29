package com.tts.task.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @Test
    void removeDuplicates_1() {

        String input = "aabbccdd";

        String expected = "abcd";
        String actual = taskService.removeDuplicates(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void removeDuplicates_2() {

        String input = "zzdvvvdqqrt";

        String expected = "zdvqrt";
        String actual = taskService.removeDuplicates(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void reverseString_1() {

        String input = "tits";

        String expected = "stit";
        String actual = taskService.reverseString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void reverseString_2() {

        String input = "leetcode";

        String expected = "edocteel";
        String actual = taskService.reverseString(input);

        Assert.assertEquals(expected, actual);
    }
}