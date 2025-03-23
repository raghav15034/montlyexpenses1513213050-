package com.monthlyexpenses.repositories;

import com.monthlyexpenses.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepositories extends JpaRepository<Categories,Long> {

}
