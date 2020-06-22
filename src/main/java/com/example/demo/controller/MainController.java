package com.example.demo.controller;

import java.util.Date;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.constants.BoardVo;
import com.example.demo.service.BoardService;

@Controller
public class MainController {
private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BoardService boardService;

	
	@GetMapping("/")
	public String getList(Model model) {
		
		model.addAttribute("boardList", boardService.selectBoardList());
		
		return "boardList";
	}
	
	@GetMapping("/insertBoard")
	public String insertBoard() {
		return "insertBoard";
	}
	
	@PostMapping("/insertBoard")
	public void insertBoard(BoardVo oneBoard, HttpServletResponse response) {
		Date date = new Date();
        oneBoard.setRegisterDate(date);
        System.out.println(oneBoard);
		try {
			boardService.insertBoard(oneBoard);
			response.sendRedirect("/");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@GetMapping("/detailBoard")
	public String detailBoard(BoardVo oneBoard, Model model) {
		Optional<BoardVo> resultVo = boardService.detailBoard(oneBoard.getBno());
		
		model.addAttribute("Board",resultVo.get());
		
		return "detailBoard";
	}
	
	@ResponseBody
	@DeleteMapping("/deleteBoard")
	public int deleteBoard(BoardVo oneBoard) {
		try {
			System.out.println("delete oneBoard : " + oneBoard.toString());
			boardService.deleteBoard(oneBoard);
			
		}
		catch(Exception ex) {
			ex.getStackTrace();
			return -1;
		}
		
		return 1;
	}
	
	@GetMapping("/modifyBoard")
	public String modifyBoard(BoardVo oneBoard, Model model) {
	
		Optional<BoardVo> resultVo = boardService.detailBoard(oneBoard.getBno());
		
		model.addAttribute("Board", resultVo.get());
		
		return "modifyBoard";
	
	}
	
	@ResponseBody
	@PutMapping("/modifyBoard")
	public int modifyBoard(BoardVo oneBoard) {
		Date date = new Date();
        oneBoard.setRegisterDate(date);
        System.out.println("oneBoard : " + oneBoard);
		try {
			boardService.insertBoard(oneBoard);
			return 1;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return -1;
	}
	
	
}
