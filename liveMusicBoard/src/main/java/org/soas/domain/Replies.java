package org.soas.domain;

import java.util.Date;

public class Replies {

	
	private int reply_idx;
	private int board_idx;
	private int member_idx;
	private String content;
	private Date regDate;
	private Date updateDate;
	
	
	public int getReply_idx() {
		return reply_idx;
	}
	public void setReply_idx(int reply_idx) {
		this.reply_idx = reply_idx;
	}
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
		return "Replies [reply_idx=" + reply_idx + ", board_idx=" + board_idx + ", member_idx=" + member_idx
				+ ", content=" + content + ", regDate=" + regDate + ", updateDate=" + updateDate + "]";
	}
	
}
