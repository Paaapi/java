//package com.paravdeep.shapes;
class circle{
    int radius;
    public double getRadius() {
        return Math.PI*radius*radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
public class circle_shape{
    public static void main(String[]args) {
        circle c=new circle();
        c.setRadius(3);
        System.out.println("the area of the circle is=");
        System.out.println(c.getRadius());
    }
}