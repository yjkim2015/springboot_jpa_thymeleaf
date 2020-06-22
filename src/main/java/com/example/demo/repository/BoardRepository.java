package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.constants.BoardVo;

@Repository
public interface BoardRepository extends JpaRepository<BoardVo, Long>{

	public Optional<BoardVo> findByBno(Long bno);
	
	public Long deleteByBno(Long bno);
	
	public Long removeByBno(Long bno);
	
}
