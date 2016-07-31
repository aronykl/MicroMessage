package com.imooc.bean;

/**
 * 与消息表对应的实体类
 * @author Administrator
 *
 */
public class Message {

	private int id;//主键
	
	private String command;//命令
	
	private String description;//描述
	
	private String content;//返回内容

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
