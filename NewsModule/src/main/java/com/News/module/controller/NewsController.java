package com.News.module.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.News.module.dto.NewsDto;
import com.News.module.dto.SubCategoryDto;
import com.News.module.model.MainCategory;
import com.News.module.model.News;
import com.News.module.model.NewsRelation;
import com.News.module.model.SubCategory;
import com.News.module.repository.MainCategoryRepo;
import com.News.module.repository.NewsRepo;
import com.News.module.repository.RelationRepo;
import com.News.module.repository.SubCategoryRepo;


@RestController
@RequestMapping(value = "/news")
public class NewsController {
	@Autowired
	private NewsRepo newsRepo;
	
	@Autowired
	private RelationRepo rRepo;
	
	@Autowired
	private MainCategoryRepo mainCatRepo;
	
	@Autowired
	private SubCategoryRepo subCatRepo;
	
	@GetMapping(value = "/category")
	public List<MainCategory> listOfMainCategory(){	 
		return mainCatRepo.findAll();
		
	}
	@GetMapping(value = "/{mcatid}/subcategory")
    public List<SubCategoryDto> listofsubCategory(@PathVariable int mcatid){
		
		List<SubCategoryDto> subcatlist= new ArrayList<>();
		for(NewsRelation mcat : rRepo.findAll()) {
		for(SubCategory cat : subCatRepo.findAll()) {
			if(mcat.getId() == mcatid) {
				subcatlist.add(new SubCategoryDto(cat.getId(),cat.getSubcategory(),mcat.getId()));
				
			    }
			
		    }
		
	    }
		 return subcatlist;
	   }
	@GetMapping("/{subcatid}/news")
    public List<NewsDto> newsHeadline(@PathVariable int id)	{
		List<NewsDto> newsdto= new ArrayList<>();
		for(SubCategory subcat: subCatRepo.findAll()) {
			for(News news: newsRepo.findAll()) {
				if(subcat.getId()==id) {
//					for(NewsRelation nr:news )
					newsdto.add(new NewsDto(news.getId(),news.getNewsHeadline(),subcat.getId()));
				}
			}
		}
		return newsdto;
	}
}
