package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductController {

    @Autowired
    ProductServiceImpl service;

    @GetMapping("/get-Product")
public List<Product> getProduct(){
//        ProductServiceImpl service = new ProductServiceImpl(); // me wenuwata @Autowired danawa globle class eke ProductServiceImpl service; eka hadanawa
        List<Product> product = service.getProduct();
        System.out.println(product);

        return product;
    }
}
