package com.aaa.spring01.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        return "test";
    }

    @GetMapping("aaa")
    public String aaa(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // option + enter -> import ㅎㅐ야...
        return Arrays.toString(arr);
    }

}
