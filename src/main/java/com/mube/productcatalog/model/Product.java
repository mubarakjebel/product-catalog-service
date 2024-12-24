package com.mube.productcatalog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;

@Data
@Document(collection = "products")
@AllArgsConstructor
@Getter
@Setter
@TypeAlias("Product")
@JsonIgnoreProperties(value = "_class", allowGetters = true)

public class Product {

    @Id
    private String id;

    @NotBlank(message = "Name is required")
    private String name;

    private String description;

    @Min(value = 0, message = "Price must be non-negative")
    private double price;

    @Min(value = 0, message = "Stock quantity must be non-negative")
    private int stockQuantity;
}

