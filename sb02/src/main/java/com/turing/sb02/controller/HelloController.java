package com.turing.sb02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author 长沙图灵科技学院
 * @Company www.tulingedu.com
 */

@Controller
//@RestController //当前类下的所有方法，全部响应JSON
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String msg1(){
        return "Hello SpringBooot01888999";
    }

    @GetMapping("/hello2")
//    @ResponseBody
    public String msg2(){
        return "Hello SpringBooot01";
    }

    //访问主页的控制器
    @GetMapping("/")
    public String index(){
        return "index";//返回视图名
    }

    //日期处理
    @GetMapping("/testDate")
    @ResponseBody
    public Date getDate(Date birthday){
        return birthday;
    }

}
