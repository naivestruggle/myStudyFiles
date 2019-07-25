package com.yxh.principle.ocp.improve;

/**
 * 开闭原则
 */
public class Ocp2 {
    public static void main(String[] args) {
        GrapgicEditor2 grapgicEditor = new GrapgicEditor2();
        grapgicEditor.drowShape(new Rectangle2());
        grapgicEditor.drowShape(new Circle2());
        grapgicEditor.drowShape(new Triangle2());
    }
}

class GrapgicEditor2{
    public void drowShape(Shape2 shape2){
        shape2.draw();
    }
}

abstract class Shape2{
    abstract void draw();
}


class Rectangle2 extends Shape2{
    @Override
    void draw() {
        System.out.println("打印矩形");
    }
}

class Circle2 extends Shape2{
    @Override
    void draw() {
        System.out.println("打印圆形");
    }
}

class Triangle2 extends Shape2{
    @Override
    void draw() {
        System.out.println("打印三角形");
    }
}