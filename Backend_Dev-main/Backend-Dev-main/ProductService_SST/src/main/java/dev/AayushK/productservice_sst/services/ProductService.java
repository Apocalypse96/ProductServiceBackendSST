package dev.AayushK.productservice_sst.services;

import dev.AayushK.productservice_sst.models.Product;

import java.util.*;

public interface ProductService {
      Product getProductById(Long id);
      List<Product> getAllProducts();
}
