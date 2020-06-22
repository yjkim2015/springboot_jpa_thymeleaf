package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.BoardVo;
import com.example.demo.service.BoardService;

@RestController
@RequestMapping("memberTest")
public class restController {
//
//	private final Logger logger = LoggerFactory.getLogger(this.getClass());
//	
//	@Autowired
//	private MemberService memberService;
//	
//	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseEntity<List<MemberVo>> getAllMembers() {
//		
//		List<MemberVo> member = memberService.findAll();
//		return new ResponseEntity<List<MemberVo>>(member, HttpStatus.OK);
//		
//	}
//	
//	@GetMapping(value="/{mbrNo}", produces = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseEntity<MemberVo> getMember(@PathVariable("mbrNo") Long mbrNo) {
//		Optional<MemberVo> member = memberService.findById(mbrNo);
//		return new ResponseEntity<MemberVo>(member.get(), HttpStatus.OK);
//	}
//	
//	@DeleteMapping(value="/{mbrNo}", produces = {MediaType.APPLICATION_JSON_VALUE} ) 
//	public ResponseEntity<Void> deleteMember(@PathVariable("mbrNo") Long mbrNo) {
//		memberService.deleteById(mbrNo);
//		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//	}
//	
//	@PutMapping(value="/{mbrNo}", produces = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseEntity<MemberVo> updateMember(@PathVariable("mbrNo") Long mbrNo, MemberVo member) {
//		memberService.updateById(mbrNo, member);
//		return new ResponseEntity<MemberVo>(member, HttpStatus.OK);
//	}
//	
//	@PostMapping
//	public ResponseEntity<MemberVo> save(@RequestBody MemberVo member) {
//		System.out.println("member :" + member.toString());
//		return new ResponseEntity<MemberVo>(memberService.save(member), HttpStatus.OK);
//	}
//	
//	
//	@RequestMapping(value="/saveMember", method = RequestMethod.GET)
//	public ResponseEntity<MemberVo> save(HttpServletRequest reqeust, MemberVo member) {
//		return new ResponseEntity<MemberVo>(memberService.save(member),HttpStatus.OK);
//	}
}
