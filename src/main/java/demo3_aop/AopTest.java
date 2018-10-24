package demo3_aop;

import demo3_aop.aop.impl.ATest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-demo-context.xml");
		ATest bean = context.getBean("aopTest" , ATest.class);
		bean.doSomething();
	}
}
