package com.monthlyexpenses.controller;

import com.monthlyexpenses.model.Categories;
import com.monthlyexpenses.model.Response;
import com.monthlyexpenses.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;
    @PostMapping("/save")
    public ResponseEntity saveCategories(@RequestBody List<Categories> categories){
        Response response=categoriesService.saveCategories(categories);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/get")
    public ResponseEntity getCategories(@PathVariable Long cate_id){
        Response response=categoriesService.gaveCategories(cate_id);
        return ResponseEntity.ok(response);
    }
}
