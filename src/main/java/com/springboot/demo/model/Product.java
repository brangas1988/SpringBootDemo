package com.springboot.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ComponentScan
@Entity
public class Product {

   @Id
    private int productid=1;
    private String name;
    private String description;

}
