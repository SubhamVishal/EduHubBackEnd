package com.edu.hub.model;

public class School {
	private String name;
	private String id;

	public School() {
	}

	public School(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", id=" + id + "]";
	}

}
