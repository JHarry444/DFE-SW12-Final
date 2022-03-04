package com.qa.jdbc;

public class Game {

	private int id;

	private String name;
	private String publisher;
	private String platform;

	public Game(int id, String name, String publisher, String platform) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.platform = platform;
	}

	public Game() {
		super(); // very important next week
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	@Override
	public String toString() {
		return "Game [id=" + this.id + ", name=" + this.name + ", publisher=" + this.publisher + ", platform="
				+ this.platform + "]";
	}

}
