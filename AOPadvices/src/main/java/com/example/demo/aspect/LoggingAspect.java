package com.example.demo.aspect;

import com.example.demo.dto.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Around(
        value = "execution(* com.example.demo.service.StudentService.dummyMethod(..))"
    )
    public Object logAroundMethod(ProceedingJoinPoint joinPoint)
            throws Throwable {

        Object return1 = joinPoint.proceed();

        System.out.println("Intercepted request calling again");

        Object return2 = joinPoint.proceed();

        return return2;
    }
}
