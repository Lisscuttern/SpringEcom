package com.lisscuttern.SpringEcom.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public String description;
    public String brand;
    public BigDecimal price;
    public String category;
    public Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;
    
    private String imageName;
    private String imageType;
    
    @Lob
    private byte[] imageData;
 
}
