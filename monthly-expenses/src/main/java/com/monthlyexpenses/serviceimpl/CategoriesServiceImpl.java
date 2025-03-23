package com.monthlyexpenses.serviceimpl;

import com.monthlyexpenses.model.Categories;
import com.monthlyexpenses.model.Response;
import com.monthlyexpenses.repositories.CategoriesRepositories;
import com.monthlyexpenses.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {
    @Autowired
    CategoriesRepositories categoriesRepositories;
    @Override
    public Response saveCategories(List<Categories> listCategories) {
        Response response=new Response();
        if(!listCategories.isEmpty()){
            categoriesRepositories.saveAll(listCategories);
            response.setStatus("success");
            response.setMessage("Data save successfully! ");
        }
        else{
          response.setStatus("error");
        }
        return response;
    }
}
