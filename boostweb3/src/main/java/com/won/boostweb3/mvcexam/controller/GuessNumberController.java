package com.won.boostweb3.mvcexam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuessNumberController {
	@GetMapping("/guess")
	public String guess(@RequestParam(name = "number", required = false) Integer number, HttpSession session,
			ModelMap model) {
		String message = null;

		if (number == null) {
			session.setAttribute("count", 0);
			session.setAttribute("randomNumber", (int) (Math.random() * 100) + 1);
			message = "내가 생각한 숫자를 맞춰보세요";
		} else {
			int count = (Integer) session.getAttribute("count");
			int randNumber = (Integer) session.getAttribute("randomNumber");

			if (number < randNumber) {
				message = "입력한 값의 숫자보다 작습니다.";
				session.setAttribute("count", ++count);
			} else if (number > randNumber) {
				message = "입력한 값의 숫자보다 큽니다.";
				session.setAttribute("count", ++count);
			} else {
				message = "정답!! " + ++count + "번째 맞췃어요. 숫자는 " + number + "입니다.";
				session.removeAttribute("count");
				session.removeAttribute("randomNumber");
			}
		}
		System.out.println(session.getAttribute("randomNumber"));
		model.addAttribute("message", message);
		return "guess";
	}
}
