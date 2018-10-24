package demo3_aop;

import demo3_aop.aop.interfaces.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Proxy;

public class AopTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-demo-context.xml");
		PersonService bean = context.getBean("person" , PersonService.class);
		bean.save();
		System.out.println("is cglib proxy: "+ ClassUtils.isCglibProxy(bean));
		System.out.println("is jdk proxy: " + Proxy.isProxyClass(bean.getClass()));
	}
}
