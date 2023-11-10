package com.example.retrofit_12.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ExampleModel{

	@SerializedName("results")
	private List<ResultsItem> results;

	@SerializedName("info")
	private Info info;

	public List<ResultsItem> getResults(){
		return results;
	}

	public Info getInfo(){
		return info;
	}
}