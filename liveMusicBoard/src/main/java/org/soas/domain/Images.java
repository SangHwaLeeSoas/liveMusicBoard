package org.soas.domain;

import java.util.Date;

public class Images {
	
	
	private int image_idx;
	private int board_idx;
	private String title;
	private int size;  // byte단윈
	private Date regDate;
	private Date updateDate;
	
	
	public int getImage_idx() {
		return image_idx;
	}
	public void setImage_idx(int image_idx) {
		this.image_idx = image_idx;
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
		return "Images [image_idx=" + image_idx + ", board_idx=" + board_idx + ", title=" + title + ", size=" + size
				+ ", regDate=" + regDate + ", updateDate=" + updateDate + "]";
	}

}
