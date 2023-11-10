package com.example.retrofit_12.model;

import java.util.List;

import com.example.retrofit_12.model.Location;
import com.example.retrofit_12.model.Origin;
import com.google.gson.annotations.SerializedName;

public class ResultsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("gender")
	private String gender;

	@SerializedName("species")
	private String species;

	@SerializedName("created")
	private String created;

	@SerializedName("origin")
	private Origin origin;

	@SerializedName("name")
	private String name;

	@SerializedName("location")
	private Location location;

	@SerializedName("episode")
	private List<String> episode;

	@SerializedName("id")
	private int id;

	@SerializedName("type")
	private String type;

	@SerializedName("url")
	private String url;

	@SerializedName("status")
	private String status;

	public String getImage(){
		return image;
	}

	public String getGender(){
		return gender;
	}

	public String getSpecies(){
		return species;
	}

	public String getCreated(){
		return created;
	}

	public Origin getOrigin(){
		return origin;
	}

	public String getName(){
		return name;
	}

	public Location getLocation(){
		return location;
	}

	public List<String> getEpisode(){
		return episode;
	}

	public int getId(){
		return id;
	}

	public String getType(){
		return type;
	}

	public String getUrl(){
		return url;
	}

	public String getStatus(){
		return status;
	}
}