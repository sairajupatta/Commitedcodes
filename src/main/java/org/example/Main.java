package org.example;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();


        service.addProduct(new Product("Asus","Laptop","Brown table",2022));
        service.addProduct(new Product("Mac","Laptop","White table",2024));
        service.addProduct(new Product("Java","Laptop","Black table",2020));

        List<Product> products = service.getAllProducts();
        for (Product p:products){
        System.out.println(p);
    }
        Product p= service.getProduct("Java");
        System.out.println(p);

        List<Product> prods = service.getProductWithText("black");
        for (Product product :prods){
            System.out.println(product);
}}}