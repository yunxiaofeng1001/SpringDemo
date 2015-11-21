package org.yun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yunxiaofeng on 15/11/21.
 */
@Controller
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/api/getUser",method = RequestMethod.GET)
    public Map<String ,Object> getUser(){
        Map<String ,Object> user = new HashMap<>();
        user.put("FirstName","yun");
        user.put("LastName","xiaofeng");
        return user;
    }
}
