package com.example.demo.aspect;

import com.example.demo.dto.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Pointcut("within(com.example.demo.service..*) " +
//            "&& " +
//            "execution(public * *(..))")
//    public void logPublicServiceMethod() {
//        // Empty body
//    }

//    @Before("@within(org.springframework.stereotype.Service)")
//    public void logBeforeMethod() {
//        System.out.println("Method Intercepted");
//    }

//    @Before("args(com.example.demo.dto.Student) " +
//            "&& " +
//            "within(com.example.demo.service..*)")
//    public void logBeforeMethod2() {
//        System.out.println("Method Intercepted");
//    }

//    @Before("@args(jdk.jfr.Timestamp) " +
//            "&& " +
//            "within(com.example.demo.service..*)")
//    public void logBeforeMethod3() {
//        System.out.println("Method Intercepted");
//    }

    @Before("this(com.example.demo.service.StudentService)")
    public void logBeforeMethod4() {
        System.out.println("Method Intercepted");
    }

//    @Before("execution(com.example.demo.dto.Student " +
//            "com.example.demo.service.StudentService.createStudent(" +
//            "com.example.demo.dto.Student))")
//    public void logBeforeMethod5() {
//        System.out.println("Method Intercepted");
//    }
}
