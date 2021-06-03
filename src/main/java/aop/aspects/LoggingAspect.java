package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetBookAdvice() {
        System.out.println("Try to get book");
    }


   /* @Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary(){
    }

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary(){
    }

    @Pointcut("allReturnMethodsFromUniLibrary() || allGetMethodsFromUniLibrary()")
        private void allGetAndReturnMethodFromUniLibrary () {
        }


        @Before("allGetMethodsFromUniLibrary()")
        public void beforeGetLoggingAdvice () {
            System.out.println("writing log 1");
        }

        @Before("allReturnMethodsFromUniLibrary()")
        public void beforeReturnLoggingAdvice () {
            System.out.println("writing log 2");
        }

        @Before("allGetAndReturnMethodFromUniLibrary()")
        public void beforeGetAndReturnLoggingAdvice() {
            System.out.println("writing log 3");
        }
    */
    }

