//package com.paravdeep.shapes;
class cylinder{
    int radius,height;
    public double getRadius() {
        return Math.PI*radius*radius*height;
    }
    public void setRadius(int radius,int height) {
        this.radius = radius;
        this.height= height;
    }
    
    
    
}
public class cylinder_shape {
    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.setRadius(3, 5);
        System.out.println("the volume of the cylinder is=");
        System.out.println(c.getRadius());
        
    }
}
