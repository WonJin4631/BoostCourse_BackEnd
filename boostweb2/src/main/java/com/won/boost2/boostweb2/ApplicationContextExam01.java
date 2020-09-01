package com.won.boost2.boostweb2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("초기화 완료!!");
		
		UserBean userBean =(UserBean) ac.getBean("userBean");
		
		userBean.setName("PARK");
		System.out.println(userBean.getName());
		
		UserBean userBean2 =(UserBean) ac.getBean("userBean");
		
		if(userBean == userBean2)
			System.out.println("같은 인스턴스입니다.");
	}

}
