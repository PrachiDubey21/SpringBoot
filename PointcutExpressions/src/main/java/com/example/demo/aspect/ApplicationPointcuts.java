package com.example.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class ApplicationPointcuts {

    @Pointcut("within(com.example.demo.controller..*)")
    public void controllerLayer() {
        // Empty body
    }

    @Pointcut("within(com.example.demo.service..*)")
    public void serviceLayer() {
        // Empty body
    }

    @Pointcut("execution(public * *(..))")
    public void publicMethod() {
        // Empty body
    }

    @Pointcut("serviceLayer() && publicMethod()")
    public void publicServiceMethod() {
        // Empty body
    }

    @Pointcut("execution(* *.get*(..))")
    public void getterMethod() {
        // Empty body
    }
}
