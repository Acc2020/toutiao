package com.devnow.toutiao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
*
 *
*/
@Controller
public class IndexController {

    @RequestMapping(path = {"/", "/index/"})
    @ResponseBody
    public String index() {
        return "helloworld";
    }


    @RequestMapping(value = {"/profile/{groupId}/{userId}"})
    //请求路径
    @ResponseBody
    //请求体
    public String profile(@PathVariable("groupId") String groupId,
                          @PathVariable("userId") int userId,
                          @RequestParam(value = "type", defaultValue = "1") int type,
                          @RequestParam(value = "key", defaultValue = "Acc2020") String key) {
        return String.format("GID{%s}, UID{%d}, TYPE{%d}, KEY{%s}", groupId, userId, type, key);
//        return "eezs";
    }

    @RequestMapping(value = {"/vm"})
    public String news() {
//        model.addAttribute("value1","vv1");
        return "news";
    }
}

