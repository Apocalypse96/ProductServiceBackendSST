package dev.AayushK.productservice_sst.controllers;

import dev.AayushK.productservice_sst.services.ProductService;
import dev.AayushK.productservice_sst.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController

@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping ("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return  productService.getProductById(id);

    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }




}
