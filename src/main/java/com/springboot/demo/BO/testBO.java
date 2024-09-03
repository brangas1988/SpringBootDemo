package com.springboot.demo.BO;


import org.springframework.stereotype.Component;

@Component
public class testBO {

    private String empid;
    private String empno;
    public String display(){
        System.out.println("Test the component");
        return "Test the component";
    }
}
