package demo4_beanLife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {
    public static void main(String[] args) {

        System.out.println("现在开始初始化容器");
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring-demo-context.xml");
        System.out.println("容器初始化成功");
        //得到Preson，并使用
        Person person = factory.getBean("personLife", Person.class);
        System.out.println(person);
        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext) factory).registerShutdownHook();
    }
}
