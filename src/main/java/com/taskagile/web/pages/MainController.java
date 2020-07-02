package com.taskagile.web.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jinwoo.
 * User: jwoh
 * Date: 2020-06-22
 * Time: 오전 8:22
 */
@Controller
public class MainController {

    @GetMapping(value = {"/","/login"})
    public String entry(){

        return "index";
    }
}
