//package com.paravdeep.shapes;

class rectangle{
    public void m(int l,int b){
        System.out.println("the surface area=" + l*b);
    }

}
public class rectangle_shape {
    public static void main(String[] args) {
        rectangle r =new rectangle();
        r.m(4, 12);
    }
}
