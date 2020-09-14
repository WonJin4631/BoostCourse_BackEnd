package com.won.boostweb3.mvcexam.service;

import java.util.List;

import com.won.boostweb3.mvcexam.dto.Guestbook;

public interface GuestbookService {
	public static final Integer LIMIT = 5;
	public List<Guestbook> getGuestbooks(Integer start);
	public int deleteGuestbook(Long id, String ip);
	public Guestbook addGuestbook(Guestbook guestbook, String ip);
	public int getCount();
}
