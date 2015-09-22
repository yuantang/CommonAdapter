package com.coder.commonadapter.bean;

public class ChatBean {
	private String time;//时间
	private String name;//用户名
	private String icon;//头像
	private String content;//内容
	private boolean isChatMsg;

	public static int SEND_MSG=0;
	public static int RECEIVE_MSG=1;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public boolean isChatMsg() {
		return isChatMsg;
	}
	public void setChatMsg(boolean isChatMsg) {
		this.isChatMsg = isChatMsg;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public static int getSEND_MSG() {
		return SEND_MSG;
	}
	public static void setSEND_MSG(int sEND_MSG) {
		SEND_MSG = sEND_MSG;
	}
}
