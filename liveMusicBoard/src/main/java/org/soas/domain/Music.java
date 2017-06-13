package org.soas.domain;

import java.util.Date;

public class Music {

	
	private int music_idx;
	private int board_idx;
	private String title;
	private int time;  // 초단위
	private int size;  // byte단위
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
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
		return "Music [music_idx=" + music_idx + ", board_idx=" + board_idx + ", title=" + title + ", time=" + time
				+ ", size=" + size + "]";
	}
	
}
