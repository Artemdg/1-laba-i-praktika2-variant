package ru.mirea.lab1;

public class Dog {
    private int age;
    private String name;
    public Dog(){
        age=1;
        name="Sharik";
    }
    public Dog(int n){
        age=n;
        name="Sharik";
    }
    public Dog(int n,String s){
        age=n;
        name=s;
    }
    public String toString(){
        return "Name="+name+" Age="+age;
    }
}