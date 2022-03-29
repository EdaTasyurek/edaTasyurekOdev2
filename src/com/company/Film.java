package com.company;

//Film adlı bir class açıldı. İçine gerekli attiributeler eklendi.
public class Film {
    private int id;
    private String name;
    private String category;
    private int imdb;


    public Film(){

    }
//Main de atanan değerler Film classının içine yazılan attiributeler ile eşleştirildi (this.) ile
    public Film (int id , String name , String category , int imdb){
        this.id = id;
        this.name = name;
        this.category = category;
        this.imdb = imdb;
    }

// alt+ins ile get set metodları eklendi.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getImdb() {
        return imdb;
    }

    public void setImdb(int imdb) {
        this.imdb = imdb;
    }
}












