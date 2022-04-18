package ru.geekbrains.less2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {


    @Autowired
    private Box box;

    public Box getBox(){
        return box;
    }
}
