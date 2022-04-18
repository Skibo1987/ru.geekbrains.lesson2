package ru.geekbrains.less2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);
        productService.getProduct(2l);
        System.out.println(productService.getProduct(2l).getTitle());
//        Box box= context.getBean(Box.class);
//        box.setColor("green");
//        Box box2 = context.getBean(Box.class);
//        System.out.println(box.getColor());
//        System.out.println(box2.getColor());


    }
}
