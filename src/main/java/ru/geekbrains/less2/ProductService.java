package ru.geekbrains.less2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class ProductService {

    @Autowired
    private ProductInMemoryRepository productInMemoryRepository;

    public Product getProduct(Long id){
       return productInMemoryRepository.findById(id);
    }
}
