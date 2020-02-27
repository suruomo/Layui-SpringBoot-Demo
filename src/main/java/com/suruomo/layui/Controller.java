package com.suruomo.layui;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping(value = "/")
    public String index(){
        return "index";
    }
    @GetMapping(value = "home/console")
    public String console(){
        return "home/console";
    }
    @GetMapping(value = "home/homepage1")
    public String homepage1(){
        return "home/homepage1";
    }
    @GetMapping(value = "home/homepage2")
    public String homepage2(){
        return "home/homepage2";
    }
    @GetMapping(value = "table")
    public String table(){
        return "table";
    }
}
