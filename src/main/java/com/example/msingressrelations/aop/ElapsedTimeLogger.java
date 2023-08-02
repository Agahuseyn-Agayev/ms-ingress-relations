package com.example.msingressrelations.aop;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Slf4j
@Component
public class ElapsedTimeLogger {

    @Pointcut(value = "execution(* com.example.msingressrelations.service.MessageService.*(..))")
    public void elapsedTimePc(){

    }
    @SneakyThrows
    @Around(value = "elapsedTimePc()")
    public void elapsedTimeLogger(ProceedingJoinPoint joinPoint){
        long startDate=System.currentTimeMillis();
        joinPoint.proceed();
        long endDate=System.currentTimeMillis();
        log.info("Elapsed time:{}",endDate-startDate);
    }

@AfterThrowing(value ="execution(* com.example.msingressrelations.service.MessageService.*(..))",throwing = "ex")
 public void afterThrowing(JoinPoint jp,Exception ex){
    System.out.println("After throwing"+jp.getSignature());
    ex.printStackTrace();
}
@Before(value = "elapsedTimePc()")
 public void logAllParameters(JoinPoint joinPoint){
 Arrays.stream(joinPoint.getArgs()).forEach(arg->log.info("All method args: {}",arg));
 }

}
