package org.soas.domain;

import java.util.Date;

public class Boards {

	
	private int board_idx;
	private int member_idx;
	private String board_name;
	private String board_content;
	private int likeCount;
	private int viewCount;
	private Date regDate;
	private Date updateDate;
	
	
	public int getBoard_idx() {
		return board_idx;
	}
	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
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
		return "Boards [board_idx=" + board_idx + ", member_idx=" + member_idx + ", board_name=" + board_name
				+ ", board_content=" + board_content + ", likeCount=" + likeCount + ", viewCount=" + viewCount
				+ ", regDate=" + regDate + ", updateDate=" + updateDate + "]";
	}
	
}
