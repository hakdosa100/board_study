package com.board.study.dto.board;

import com.board.study.entity.board.Board;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public class BoardResponseDto {
	private Long id;
	private String title;
	private String content;
	private int readCnt;
	private String registerId;
	private LocalDateTime registerTime;

	public BoardResponseDto(Board entity){
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.content = entity.getContent();
		this.readCnt = entity.getReadCnt();
		this.registerId = entity.getRegisterId();
		this.registerTime = entity.getRegisterTime();
	}

	@Override
	public String toString(){
		return "BoardListDto [id=" + id + ", title=" + title + ", content=" + content + ", readCnt=" + readCnt +
				", registerId=" + registerId + ", registerTime" + registerTime + "]";

	}
}
