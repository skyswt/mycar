package cn.hyperchain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActivityController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "hello3";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        return "hello2";
    }

}
