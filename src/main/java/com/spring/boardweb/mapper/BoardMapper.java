package com.spring.boardweb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BoardMapper {
	int getNextBoardSeq();

	@Update("UPDATE T_BOARD SET BOARD_SEQ = BOARD_SEQ - 1 WHERE BOARD_SEQ > #{boardSeq")
	void updateBoardSeq(int boardSeq);

}
