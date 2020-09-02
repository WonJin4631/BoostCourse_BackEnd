package com.won.boost2.boostweb2.main;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.won.boost2.boostweb2.config.ApplicationConfig3;
import com.won.boost2.boostweb2.dao.RoleDao;
import com.won.boost2.boostweb2.dto.Role;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig3.class);

		RoleDao roleDao = ac.getBean(RoleDao.class);

		Role role = new Role();
		role.setRoleId(103);

		role.setDescription("PROGRAMMER");
//		int count = roleDao.insert(role);
//		System.out.println(count + "건 입력했습니다");

		int count = roleDao.update(role);
		System.out.println(count + "건 수정했습니다");

		Role resultRole = roleDao.selectById(103);
		System.out.println(resultRole);

		int deleteCount = roleDao.deleteById(500);
		System.out.println(deleteCount + " 건 삭제되었습니다");
		
		Role resultRole2 = roleDao.selectById(500);
		System.out.println(resultRole2);

	}

}
