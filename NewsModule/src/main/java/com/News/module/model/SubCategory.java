package com.News.module.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class SubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sub_category")
	private String subcategory;
	
	@Column (name= "meta_data")
	private String metaData;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_category_id",nullable = false)
	private MainCategory parentCatId;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public String getMetaData() {
		return metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}


	@Override
	public String toString() {
		return "SubCategory [id=" + id + ", subcategory=" + subcategory + ", metaData=" + metaData + ", parentCatId="
				+ parentCatId +  "]";
	}
	
	


	
//	@JsonIgnore
//	@OneToMany(mappedBy = "subcategory",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<SubCategory> subcategory;

}
