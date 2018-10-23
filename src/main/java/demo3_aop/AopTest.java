package demo3_aop;

import demo3_aop.aop.ATest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-demo-context.xml");
		ATest bean = (ATest)context.getBean("aopTest");
		bean.doSomething();
	}
}
