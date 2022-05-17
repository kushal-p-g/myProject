package com.News.module.dto;

import lombok.Data;

@Data
public class SubCategoryDto {
	
	private int id;
	
	private String subcategory;
	
	private int parentCatId;
	

	public int getParentCatId() {
		return parentCatId;
	}

	public void setParentCatId(int parentCatId) {
		this.parentCatId = parentCatId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSub_category(String subcategory) {
		this.subcategory = subcategory;
	}

	@Override
	public String toString() {
		return "SubCategoryDto [id=" + id + ", subcategory=" + subcategory + ", parentCatId=" + parentCatId + "]";
	}

	public SubCategoryDto(int id, String subcategory, int parentCatId) {
		super();
		this.id = id;
		this.subcategory = subcategory;
		this.parentCatId = parentCatId;
	}


	

}
