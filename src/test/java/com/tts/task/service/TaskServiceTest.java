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

    @Test
    void containsDuplucates_1(){
        int[] input = new int[]{1,2,3,1};

        Assert.assertTrue(taskService.containsDuplicate(input));

    }

    @Test
    void containsDuplucates_2(){
        int[] input = new int[]{1,2,3,4};

        Assert.assertFalse(taskService.containsDuplicate(input));
    }

    @Test
    void containsDuplucates_3(){
        int[] input = new int[]{1,1,1,3,3,4,3,2,4,2};

        Assert.assertTrue(taskService.containsDuplicate(input));
    }
}