package com.News.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.News.module.model.NewsRelation;

public interface RelationRepo extends JpaRepository<NewsRelation, Integer>{

}
