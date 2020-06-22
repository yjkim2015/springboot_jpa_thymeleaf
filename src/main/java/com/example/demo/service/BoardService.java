package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.constants.BoardVo;
import com.example.demo.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	
	public List<BoardVo> selectBoardList() {
		
		return boardRepository.findAll();
	}
	
	public void insertBoard(BoardVo oneBoard) {
		boardRepository.save(oneBoard);
	}
	
	public Optional<BoardVo> detailBoard(Long bno) {
		return boardRepository.findByBno(bno);
	}
	@Transactional
	public void deleteBoard(BoardVo oneBoard) {
		System.out.println("delete bno : " + oneBoard.getBno());
		boardRepository.deleteByBno(oneBoard.getBno());
	}
	
	public void updateBoard(BoardVo oneBoard) {
		boardRepository.save(oneBoard);
	}
	@Transactional
	public void removeBoard(BoardVo oneBoard) {
		
		boardRepository.removeByBno(oneBoard.getBno());
	}
}
