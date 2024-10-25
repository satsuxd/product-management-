package com.productmanagement.product.management.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="products")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifying the ID generation strategy
    private int id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="price", nullable = false)
    private double price;

    @Column(name="tax", nullable = false)
    private int tax; // Assuming tax is a percentage value

    @Column(name="expiration_date", nullable = false) // Renaming to follow snake_case for consistency
    private Date expirationDate;

    @Column(name="image", nullable = false) // Storing the file path or URL of the image
    private String image; 

    // Remove the `MultipartFile` field from the entity as JPA can't persist it

    public Product() {
        super();
    }

    public Product(int id, String name, double price, int tax, Date expirationDate, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
        this.expirationDate = expirationDate;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + ", expirationDate=" + expirationDate + ", image=" + image + "]";
    }
}
