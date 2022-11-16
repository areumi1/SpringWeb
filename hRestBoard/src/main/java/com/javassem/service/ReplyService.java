package com.javassem.service;

import java.util.List;


import com.javassem.domain.ReplyVO;

public interface ReplyService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	int insertReply(ReplyVO vo);

	// 글 수정
	void updateReply(ReplyVO vo);

	// 글 삭제
	void deleteReply(Integer rno);


	// 글 목록 조회
	List<ReplyVO> selectAllReply();
}