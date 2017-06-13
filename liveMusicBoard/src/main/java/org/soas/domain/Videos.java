package org.soas.domain;

import java.util.Date;

public class Videos {

	
	private int video_idx;
	private int board_idx;
	private String board_name;
	private int board_time;  // 초단위
	private int board_size;  // byte단위
	private Date regDate;
	private Date updateDate;
	
	
	public int getVideo_idx() {
		return video_idx;
	}
	public void setVideo_idx(int video_idx) {
		this.video_idx = video_idx;
	}
	public int getBoard_idx() {
		return board_idx;
	}
	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public int getBoard_time() {
		return board_time;
	}
	public void setBoard_time(int board_time) {
		this.board_time = board_time;
	}
	public int getBoard_size() {
		return board_size;
	}
	public void setBoard_size(int board_size) {
		this.board_size = board_size;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Videos [video_idx=" + video_idx + ", board_idx=" + board_idx + ", board_name=" + board_name
				+ ", board_time=" + board_time + ", board_size=" + board_size + ", regDate=" + regDate + ", updateDate="
				+ updateDate + "]";
	}
	
}
