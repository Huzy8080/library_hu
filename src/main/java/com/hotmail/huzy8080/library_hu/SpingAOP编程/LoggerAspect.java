package com.hotmail.huzy8080.library_hu.SpingAOP编程;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 切面
 */
@Component
@Aspect
public class LoggerAspect {

    @Pointcut("execution(public * com.hotmail.huzy8080.library_hu.SpingAOP编程.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void beforeMethod(JoinPoint jointPoint){
        String methodName = jointPoint.getSignature().getName();
        List args = Arrays.asList(jointPoint.getArgs());
        System.out.println("Method("+methodName+") args("+args+") Start");
    }

    @After(value="pointCut()")
    public void afterMethod(JoinPoint jointPoint){
        String methodName = jointPoint.getSignature().getName();
        List args = Arrays.asList(jointPoint.getArgs());
        System.out.println("Method("+methodName+") args("+args+") After");
    }

    @AfterReturning(value="pointCut()",returning="result")
    public void afterReturingMethod(JoinPoint jointPoint,Object result){
        String methodName = jointPoint.getSignature().getName();
        List args = Arrays.asList(jointPoint.getArgs());
        System.out.println("Method("+methodName+") args("+args+") After Runing + Result:"+result);
    }

    @AfterThrowing(value="pointCut()",throwing="e")
    public void afterThrowingMethod(JoinPoint jointPoint,Exception e){
        String methodName = jointPoint.getSignature().getName();
        List args = Arrays.asList(jointPoint.getArgs());
        System.out.println("Method("+methodName+") args("+args+") After Throw Exception:" +e);
    }

    /**
     *  * 注意：@Around环绕通知，必须携带对象ProceedingJoinPoint参数
     *  *
     *  * 环绕通知类似于动态代理的全部过程，可以决定是否执行目标方法
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("pointCut()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("log start...");
        Object proceed = joinPoint.proceed();
        System.out.println("log end...");
        return proceed;
    }

}
