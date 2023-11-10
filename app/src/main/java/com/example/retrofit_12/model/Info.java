package com.example.retrofit_12.model;

import com.google.gson.annotations.SerializedName;

public class Info{

	@SerializedName("next")
	private String next;

	@SerializedName("pages")
	private int pages;

	@SerializedName("prev")
	private Object prev;

	@SerializedName("count")
	private int count;

	public String getNext(){
		return next;
	}

	public int getPages(){
		return pages;
	}

	public Object getPrev(){
		return prev;
	}

	public int getCount(){
		return count;
	}
}