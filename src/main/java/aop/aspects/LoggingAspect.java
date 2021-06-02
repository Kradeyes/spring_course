package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* getBook(..))")
    public void beforeGetBookAdvice() {
        System.out.println("Try to get book");
    }
}
