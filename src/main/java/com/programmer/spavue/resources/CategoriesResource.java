package com.programmer.spavue.resources;

import com.programmer.spavue.modelo.Categories;
import com.programmer.spavue.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriesResource {

    @Autowired
    private CategoriesService service;

    @RequestMapping(value="/{id}", method =  RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Categories obj = service.buscar(id);
        return  ResponseEntity.ok().body(obj);

    }

    @RequestMapping(method =  RequestMethod.GET)
    public ResponseEntity<?> buscarTodos(){
        List<Categories> obj = service.BuscarTodos();
        return  ResponseEntity.ok().body(obj);

    }



}
