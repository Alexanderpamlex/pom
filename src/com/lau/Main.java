package com.lau;

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Rectangle("Red",4,5);
        System.out.println(s1);
        System.out.println(s1.getArea());

        Shape r = new Triangle("Black",2,4);
        System.out.println(r);
        System.out.println(r.getArea());

        Circle c = new Circle(3,"Yellow");
        System.out.println(c);

        Square sq = new Square(3,"Pink");
        System.out.println(sq);


    }
}
