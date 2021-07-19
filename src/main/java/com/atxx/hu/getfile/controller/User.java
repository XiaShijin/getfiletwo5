package com.atxx.hu.getfile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User {

//    @RequestMapping("/getView")
//    public String getView(){
//        System.out.println("本程序开始");
//        return "getViewend";
//    }
    @RequestMapping("/getViewend")
    public void getViewend(){
        System.out.println("这里结......");
        System.out.println("这里结two");
        System.out.println("这里结three");
        System.out.println("这里结three");
    }

}
