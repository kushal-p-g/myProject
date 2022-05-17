package com.News.module.repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.News.module.model.SubCategory;
@Repository
public interface SubCategoryRepo extends JpaRepository<SubCategory, Integer> {
//@Query(value = "Select id,sub_category from sub_category where parent_category_id = ?1",nativeQuery = true)
//	Optional<SubCategory> coustem(int id);

}
