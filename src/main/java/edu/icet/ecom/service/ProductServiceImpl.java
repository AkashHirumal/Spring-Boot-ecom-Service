package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service

public class ProductServiceImpl implements ProductService {

    public List<Product> getProduct(){

        Product pro1 = new Product();
        pro1.setName("Apple");
        pro1.setVender("bbb");
        pro1.setPrice(200.0);

        Product pro2 = new Product();
        pro2.setName("Cake");
        pro2.setVender("aaa");
        pro2.setPrice(400.0);

        Product pr3 = new Product("Oreng","rrrr",500.0);

        Product pr4 = Product.builder()
                .name("Banana")
                .vender("ssss")
                .price(600.0).build();

        return Arrays.asList(pro1,pro2,pr3,pr4);
    }
}
