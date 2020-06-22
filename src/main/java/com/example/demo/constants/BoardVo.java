package com.example.demo.constants;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="TB_BOARD")
public class BoardVo {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bno; 
	
	private String title; 
	private String contents;
	private String writer;
	private Date registerDate;
	
	public Long getBno() {
		return bno;
	}

	public void setBno(Long bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContents() {
		return contents;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public Date getRegisterDate() {
		return registerDate;
	}
	
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	@Override
	public String toString() {
		return "BoardVo [bno=" + bno + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", registerDate=" + registerDate + "]";
	}
	
}
