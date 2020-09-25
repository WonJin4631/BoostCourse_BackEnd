package com.won.boostweb4.securutyexam.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.won.boostweb4.securityexam.config.ApplicationConfig;
import com.won.boostweb4.securityexam.config.SecurityConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class, SecurityConfig.class })
public class PasswordEncoderTest {
	@Autowired
	PasswordEncoder passwordEncoder;

	@Test
	public void passwordEncode() throws Exception {
		System.out.println(passwordEncoder.encode("1234"));
	}

	@Test
	public void passwordTest() throws Exception {
		String encodePasswd = "$2a$10$c.4cafQTerFi/z60YhjjaOwQwo8v4rwxrOBXdP9RbfL89fGTypV9G";
		String password = "1234";
		boolean test = passwordEncoder.matches(password, encodePasswd);
		System.out.println(test);
	}

}