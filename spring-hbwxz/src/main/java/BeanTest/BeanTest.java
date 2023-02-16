package BeanTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("spring-config.xml");
		TestBean bean = applicationContext.getBean(TestBean.class);
		System.out.println(bean.getName());

		//
	}
}
