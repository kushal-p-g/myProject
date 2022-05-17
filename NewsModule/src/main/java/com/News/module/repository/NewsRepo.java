package com.News.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.News.module.model.News;
@Repository
public interface NewsRepo extends JpaRepository<News, Integer> {

}
