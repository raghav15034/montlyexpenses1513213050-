package com.monthlyexpenses.controller;

import com.monthlyexpenses.model.Categories;
import com.monthlyexpenses.model.Response;
import com.monthlyexpenses.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
    @Autowired
    CategoriesService categoriesService;
    @PostMapping("/save")
    public ResponseEntity saveCategories(@RequestBody List<Categories> categories){
        Response response=categoriesService.saveCategories(categories);
        return ResponseEntity.ok(response);
    }
}
