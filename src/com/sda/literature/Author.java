package com.sda.literature;

public class Author {

    private String firstName;

    private  String surName;

    private String nationality;

    private String getNationality(){
        return nationality;
    }

    public String getAuthorInfo(){
        return "Moja informacja o autorze: " + firstName;
    }
}
