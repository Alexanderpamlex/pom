package com.lau;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public String toString(){
        return "Треугольник с основание: "+base+ " и высотой: "+height+ ", подкласс " + super.toString();
    }

    @Override
    public double getArea() {
        System.out.print("Площадь ровна: ");
        return 0.5*base*height;
    }


}
