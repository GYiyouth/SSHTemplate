package pojo.vo;

import org.springframework.stereotype.Component;
import tool.BeanFactory;

/**
 * Created by geyao on 2017/3/9.
 */
@Component
public class TestVO {

    public void hello(){
        System.out.println("hello World");
    }

    public static void main(String[] args) {
        TestVO testVO = BeanFactory.getBean("testVO", TestVO.class);
        testVO.hello();
    }
}
