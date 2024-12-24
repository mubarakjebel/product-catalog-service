package com.mube.productcatalog.repository;

import com.mube.productcatalog.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
