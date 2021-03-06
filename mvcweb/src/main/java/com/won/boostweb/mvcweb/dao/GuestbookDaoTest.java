package com.won.boostweb.mvcweb.dao;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.won.boostweb.mvcweb.config.ApplicationConfig;
import com.won.boostweb.mvcweb.dto.Guestbook;
import com.won.boostweb.mvcweb.dto.Log;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		GuestbookDao guestbookDao = ac.getBean(GuestbookDao.class);
		
		Guestbook guestbook = new Guestbook();
		guestbook.setName("박원진");
		guestbook.setContent("반갑습니다. 여러분.");
		guestbook.setRegdate(new Date());
		Long id = guestbookDao.insert(guestbook);
		System.out.println("id : " + id);
		
//		LogDao logDao = ac.getBean(LogDao.class);
//		Log log = new Log();
//		log.setIp("127.0.0.1");
//		log.setMethod("insert");
//		log.setRegdate(new Date());
//		logDao.insert(log);
	}

}
