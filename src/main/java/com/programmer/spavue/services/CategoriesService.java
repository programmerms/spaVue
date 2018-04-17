package com.programmer.spavue.services;

import com.programmer.spavue.modelo.Categories;
import com.programmer.spavue.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesRepository repo;

    public Categories buscar(Integer id) {
        Optional<Categories> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public List<Categories> BuscarTodos() {
        List<Categories> obj = repo.findAll();
        return obj;
    }




}
