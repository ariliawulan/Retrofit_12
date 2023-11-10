package com.example.retrofit_12.model;

import com.google.gson.annotations.SerializedName;

public class Location{

	@SerializedName("name")
	private String name;

	@SerializedName("url")
	private String url;

	public String getName(){
		return name;
	}

	public String getUrl(){
		return url;
	}
}