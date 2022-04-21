package ru.geekbrains.less2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class ProductService {

    @Autowired
//    @Qualifier("productInMemoryRepository")
    private Repository repository;

    public Product getProduct(Long id){
       return repository.findById(id);
    }
}
