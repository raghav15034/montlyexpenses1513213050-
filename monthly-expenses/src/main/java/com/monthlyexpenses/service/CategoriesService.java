package com.monthlyexpenses.service;

import com.monthlyexpenses.model.Categories;
import com.monthlyexpenses.model.Response;
import java.util.List;

public interface CategoriesService {
    public Response saveCategories(List<Categories> listCategories);
    public Response gaveCategories(Long cate_id);
}
