package com.News.module.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.News.module.model.MainCategory;
@Repository
public interface MainCategoryRepo extends JpaRepository<MainCategory, Integer> {


}
