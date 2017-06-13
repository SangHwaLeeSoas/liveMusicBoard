package org.soas.domain;

import java.util.Date;

public class Music {

	
	private int music_idx;
	private int board_idx;
	private String music_name;
	private int music_time;  // 초단위
	private int music_size;  // byte단위
	private Date regDate;
	private Date updateDate;
	
	
	public int getMusic_idx() {
		return music_idx;
	}
	public void setMusic_idx(int music_idx) {
		this.music_idx = music_idx;
	}
	public int getBoard_idx() {
		return board_idx;
	}
	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}
	public String getMusic_name() {
		return music_name;
	}
	public void setMusic_name(String music_name) {
		this.music_name = music_name;
	}
	public int getMusic_time() {
		return music_time;
	}
	public void setMusic_time(int music_time) {
		this.music_time = music_time;
	}
	public int getMusic_size() {
		return music_size;
	}
	public void setMusic_size(int music_size) {
		this.music_size = music_size;
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
		return "Music [music_idx=" + music_idx + ", board_idx=" + board_idx + ", music_name=" + music_name
				+ ", music_time=" + music_time + ", music_size=" + music_size + ", regDate=" + regDate + ", updateDate="
				+ updateDate + "]";
	}
	
}
