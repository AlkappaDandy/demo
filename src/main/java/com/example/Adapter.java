package com.example;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Adapter{

   public static List<Product> deserializRecipes(){
      Gson gson = new Gson();
      java.lang.reflect.Type productList = new TypeToken<ArrayList<Product>>(){}.getType();
      List<Product> products = gson.fromJson(FileReader.readJsonFile("test.json"),productList);
      return products;
   }
   
}

