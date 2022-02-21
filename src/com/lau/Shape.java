package com.lau;

public class Shape {

    private String color;

    public Shape(){
        this.color = "White";
    }

    public Shape(String color){
         this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Цвет фигуры: " + color;
    }

    public double getArea(){
        System.out.println("Фигура не известна, невозможно вычеслить площадь!");
        return 0;
    }
}
