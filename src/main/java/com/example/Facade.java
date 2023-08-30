package com.example;

import java.util.ArrayList;
import java.util.List;

public class Facade {


    public static Product getProductById(int id){
        for (Product product : Adapter.deserializRecipes()){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }
    public static List<Product> getProductsByCategory(String category){
        List<Product> products = new ArrayList<>();
        for (Product product : Adapter.deserializRecipes()){
            if (product.getCategory().equals(category)){
                products.add(product);
                System.out.println(product.getCategory());
            }
        }
        return products;
    }

    public static void startProgram(){
        System.out.println("what would you like to do?");
        System.out.println("");
        System.out.println("");
    }
    

}
