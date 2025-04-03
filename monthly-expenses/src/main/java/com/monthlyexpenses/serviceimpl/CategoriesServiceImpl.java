package com.monthlyexpenses.serviceimpl;

import com.monthlyexpenses.model.Categories;
import com.monthlyexpenses.model.Response;
import com.monthlyexpenses.repositories.CategoriesRepositories;
import com.monthlyexpenses.service.CategoriesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    CategoriesRepositories categoriesRepositories;

    @Override
    public Response saveCategories(List<Categories> listCategories) {
        Response response = new Response();
        if (!listCategories.isEmpty()) {
            categoriesRepositories.saveAll(listCategories);
            response.setStatus("success");
            response.setMessage("Categories Data save successfully! ");
            log.info("CategoriesServiceImpl -> "+(listCategories));
        } else {
            response.setStatus("error");
            log.error("CategoriesServiceImpl"+response);
        }
        return response;
    }

    @Override
    public Response gaveCategories(Long cate_id) {
        Response response = new Response();
        if (cate_id != null) {
            Categories categories = categoriesRepositories.getReferenceById(cate_id);
            response.setData(categories);
            response.setStatus("Success");
            response.setMessage("Categories Data get successfully");
        } else {
            response.setError("Error");
        }
        return response;
    }
}
