package com.example.UrGW2Builds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 
    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
    
    @RequestMapping(value = "/specs")
    public String speclist() {
        return "specializationlist.html";
    }
    
    @RequestMapping(value = "/builds")
    public String buildlist() {
        return "buildlist.html";
    }
    @RequestMapping(value = "/createbuild")
    public String createbuilds() {
        return "CreateNewBuild.html";
    }
    @RequestMapping(value = "/createspec")
    public String createspecs() {
        return "CreateNewSpec.html";
    }
    
}