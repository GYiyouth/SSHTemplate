package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by geyao on 2017/3/9.
 */
@Aspect
public class AopTest {
    @Before("execution(* pojo.vo.TestVO.*(..))")
    public void foo(){
        System.out.println("before");
    }
}
