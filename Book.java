package ru.mirea.lab1;

public class Book {
    private String author;
    private String name;
    public Book(){
        author="Lermontov";
        name="A Hero of Our Time";
    }
    public Book(String s){
        author="Lermontov";
        name=s;
    }
    public Book(String t,String s){
        author=s;
        name=t;
    }
    public String toString(){
        return "author="+author+" name="+name;
    }
}

