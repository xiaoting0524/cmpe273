package com.XJ.lab1;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	private int Id;
	private String name;
	private int score;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", score=" + score + ", Id=" + Id + "]";
	}

}
