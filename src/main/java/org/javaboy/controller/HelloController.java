package org.javaboy.controller;/**
 * @Description:
 * @Author: YangYong
 * @Date: 2020/8/15 11:28
 */

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName:HelloController
 *@Author:yezongzhen
 *@Date:2020/8/15 11:28
 *@Description:
 *@Version:1.0
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String test(){
        return "hello";
    }
}
