/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sbStratega.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LENOVO
 */
@RestController
//@RequestMapping("/*")
public class HolaController {
    @RequestMapping("/")
    public String hola(){
        return "hola SpringBoot";
    }
    
    @RequestMapping("/uno")
    public String holaUno(){
        return "SpringBoot UNO";
    }
    
    @RequestMapping("/test")
    public String holaDos(){
        return "Stratega";
    }
    
}
