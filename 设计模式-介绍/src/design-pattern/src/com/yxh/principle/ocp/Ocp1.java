package com.yxh.principle.ocp;

/**
 * 开闭原则
 */
public class Ocp1 {
    public static void main(String[] args) {
        //使用 看看存在的问题
        GrapgicEditor grapgicEditor = new GrapgicEditor();
        grapgicEditor.drawRectangle(new Rectangle());
        grapgicEditor.drawCircle(new Circle());
        grapgicEditor.drawTriangle(new Triangle());
    }
}

/**
 * 这是一个用于绘图的类[使用方]
 */
class GrapgicEditor{
    /**
     * 根据type，绘制不同的图形
     * @param s  接受Shape对象
     */
    public void drawShape(Shape s){
        if(s.m_type == 1){
            drawRectangle(s);
        }else if(s.m_type == 2){
            drawCircle(s);
        }else if(s.m_type == 3){
            drawTriangle(s);
        }
    }

    public void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    public void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }


    /**
     * 增加绘制三角形的方法
     */
    public void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }

}

class Shape{
    int m_type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}


/**
 * 新增画三角形的类
 */
class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }
}