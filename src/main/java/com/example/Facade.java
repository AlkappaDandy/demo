package com.example;
public class Facade {

    public static void doStuff(){
        System.out.println(Adapter.deserializRecipes().get(0).toString());
    }

    public static Product getSingleProduct(int id){
        for (Product recipe : Adapter.deserializRecipes()){
            if (recipe.getId() == id){
                return recipe;
            }
        }
        return null;
    }
    

}
