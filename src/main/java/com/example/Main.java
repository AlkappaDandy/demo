package com.example;
class Main{

    public static void main(String[] args) throws Exception {
        System.out.println(Facade.getSingleProduct(1).getTitle());
    }
}