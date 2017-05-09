package com.sda.generator;

public enum UserSex {
	SEX_MALE(0, "mężczyzna"), SEX_FEMALE(1, "kobieta");

	private int sexId;
	private String slug;

	private UserSex(int id, String slug) {
		this.sexId = id;
		this.slug = slug;
	}

	public int getId() {
		return this.sexId;
	}
	
	public String getSlug() {
		return this.slug;
	}
}
