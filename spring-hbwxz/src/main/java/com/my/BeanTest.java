package com.my;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	public static void main(String[] args) {
		// // xml形式开发
		// ClassPathXmlApplicationContext applicationContext =
		// 		new ClassPathXmlApplicationContext("spring-config.xml");
		// TestBean bean = applicationContext.getBean(TestBean.class);
		// System.out.println(bean.getName());


		// 基于annotation的形式（主流）
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TestBean bean = (TestBean) applicationContext.getBean("testBean");
		System.out.println(bean.getName());


	}
}
