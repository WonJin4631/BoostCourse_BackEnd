package com.won.boostweb.mvcweb.service.impl;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.won.boostweb.mvcweb.config.ApplicationConfig;
import com.won.boostweb.mvcweb.dto.Guestbook;
import com.won.boostweb.mvcweb.service.GuestbookService;

public class GuestbookServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		GuestbookService guestbookService = ac.getBean(GuestbookService.class);
		
		Guestbook guestbook = new Guestbook();
		guestbook.setName("wonjin");
		guestbook.setContent("열심히 공부를 합시다.");
		guestbook.setRegdate(new Date());
		Guestbook result = guestbookService.addGuestbook(guestbook, "127.0.0.1");
		System.out.println(result);
	}

}
