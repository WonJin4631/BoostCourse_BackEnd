package com.won.boost2.boostweb2.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.won.boost2.boostweb2.config.ApplicationConfig3;
import com.won.boost2.boostweb2.dao.RoleDao;
import com.won.boost2.boostweb2.dto.Role;

public class SelectAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig3.class);

		RoleDao roleDao = ac.getBean(RoleDao.class);

		List<Role> list = roleDao.selectAll();

		for (Role role : list) {
			System.out.println(role);
		}
	}

}
