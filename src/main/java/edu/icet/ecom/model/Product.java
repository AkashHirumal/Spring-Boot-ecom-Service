package edu.icet.ecom.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Product {
    private String name;
    private String vender;
    private double price;
}
