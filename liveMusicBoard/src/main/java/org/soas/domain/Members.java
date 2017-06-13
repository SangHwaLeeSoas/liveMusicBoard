package org.soas.domain;

import java.util.Date;

public class Members {
	
	
	private int member_idx;
	private String name;
	private String nickname;
	private int sex;  // 1=남, 2=여
	private int age;
	private String email;
	private int email_accept;  // 0=미정, 1=동의, 2=비동의
	private int phoneNumber;  // DecimalFormat phoneFmt = new DecimalFormat("###-###-####")
	private int phoneNumber_accept;  // 0=미정, 1=동의, 2=비동의
	private String profile;
	private Date regDate;
	private Date updateDate;
	
	
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEmail_accept() {
		return email_accept;
	}
	public void setEmail_accept(int email_accept) {
		this.email_accept = email_accept;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPhoneNumber_accept() {
		return phoneNumber_accept;
	}
	public void setPhoneNumber_accept(int phoneNumber_accept) {
		this.phoneNumber_accept = phoneNumber_accept;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
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
		return "Members [member_idx=" + member_idx + ", name=" + name + ", nickname=" + nickname + ", sex=" + sex
				+ ", age=" + age + ", email=" + email + ", email_accept=" + email_accept + ", phoneNumber="
				+ phoneNumber + ", phoneNumber_accept=" + phoneNumber_accept + ", profile=" + profile + ", regDate="
				+ regDate + ", updateDate=" + updateDate + "]";
	}
	
}
