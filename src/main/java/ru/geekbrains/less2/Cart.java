package ru.geekbrains.less2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private ProductService productService;
    private List<Product> productList;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getAllProduct() {
        return productList;
    }

    @PostConstruct
    private void init(){
        productList = new ArrayList<>();
    }

    public void addProduct(Long id){
        productList.add(productService.getProduct(id));
    }

    public void delete (Long id){
        productList.removeIf(p -> p.getId().equals(id));
    }

}
