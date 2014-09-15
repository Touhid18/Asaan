package com.techfiesta.asaanintro.model;

public class Restaurent {
	
	private int id, favCount, visitCount, recommendationCount;
	private String name,cuisineType;
	private float distInMile, likePercentage;
	
	public Restaurent(int id, int favCount, int visitCount, int recommendationCount, String name, String cuisineType,
			float distInMile, float likePercentage) {
		super();
		this.id = id;
		this.favCount = favCount;
		this.visitCount = visitCount;
		this.recommendationCount = recommendationCount;
		this.name = name;
		this.cuisineType = cuisineType;
		this.distInMile = distInMile;
		this.likePercentage = likePercentage;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the favCount
	 */
	public int getFavCount() {
		return favCount;
	}
	/**
	 * @param favCount the favCount to set
	 */
	public void setFavCount(int favCount) {
		this.favCount = favCount;
	}
	/**
	 * @return the visitCount
	 */
	public int getVisitCount() {
		return visitCount;
	}
	/**
	 * @param visitCount the visitCount to set
	 */
	public void setVisitCount(int visitCount) {
		this.visitCount = visitCount;
	}
	/**
	 * @return the recommendationCount
	 */
	public int getRecommendationCount() {
		return recommendationCount;
	}
	/**
	 * @param recommendationCount the recommendationCount to set
	 */
	public void setRecommendationCount(int recommendationCount) {
		this.recommendationCount = recommendationCount;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cuisineType
	 */
	public String getCuisineType() {
		return cuisineType;
	}
	/**
	 * @param cuisineType the cuisineType to set
	 */
	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
	/**
	 * @return the distInMile
	 */
	public float getDistInMile() {
		return distInMile;
	}
	/**
	 * @param distInMile the distInMile to set
	 */
	public void setDistInMile(float distInMile) {
		this.distInMile = distInMile;
	}
	/**
	 * @return the likePercentage
	 */
	public float getLikePercentage() {
		return likePercentage;
	}
	/**
	 * @param likePercentage the likePercentage to set
	 */
	public void setLikePercentage(float likePercentage) {
		this.likePercentage = likePercentage;
	}

}
