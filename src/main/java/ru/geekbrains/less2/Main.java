package ru.geekbrains.less2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);
        Cart cart = context.getBean(Cart.class);
//        productService.getProduct(2l);
        System.out.println(productService.getProduct(1l).getTitle());
//        Box box= context.getBean(Box.class);
//        box.setColor("green");
//        Box box2 = context.getBean(Box.class);
//        System.out.println(box.getColor());
//        System.out.println(box2.getColor());
        Scanner scanner = new Scanner(System.in);

        while (true){
            String ans = scanner.nextLine();
                if(ans.equals("/add")){
                    System.out.println("Add id of product");
                    Long id = scanner.nextLong();
                    cart.addProduct(id);
                    System.out.println("The Product has added.");
                }else if (ans.equals("/delete")){
                    System.out.println("Add id of product");
                    Long id = scanner.nextLong();
                    cart.delete(id);
                    System.out.println("The Product has deleted.");
                } else if (ans.equals("/cart")){
                    System.out.println(cart.getAllProduct());
                }else if (ans.equals("/end")){
                    break;
                }

        }

    }
}
