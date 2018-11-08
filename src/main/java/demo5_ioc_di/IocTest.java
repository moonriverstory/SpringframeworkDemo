package demo5_ioc_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    public static void main(String[] args) {
        // 加载xml配置
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-demo-context.xml");

        // IOC获取Bean
        TestBeanService testBeanService = context.getBean(TestBeanService.class);

        System.out.println(testBeanService.getBean());
    }
}
