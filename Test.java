package ru.mirea.lab1;

public class Test {
    public static void main(String[] args){
        Dog pes=new Dog();//1st constructor
        System.out.println(pes.toString());
        Dog pes1=new Dog(2);
        System.out.println(pes1.toString());
        Dog pes2=new Dog(3,"Strelka");
        System.out.println(pes2.toString());
        Ball myach=new Ball();
        System.out.println(myach.toString());
        Ball myach1=new Ball("small");
        System.out.println(myach1.toString());
        Ball myach2=new Ball("basketball","big");
        System.out.println(myach2.toString());
        Book kniga=new Book();
        System.out.println(kniga.toString());
        Book kniga1=new Book("Yevgeny Onegin");
        System.out.println(kniga1.toString());
        Book kniga2=new Book(" War and Peace ","Leo Tolstoy");
        System.out.println(kniga2.toString());
    }
}
