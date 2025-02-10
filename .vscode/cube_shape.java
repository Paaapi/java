//package com.paravdeep.shapes;
class cube{
    int side;
    public int getSide() {
        return side*side*side;
    }
    public void setSide(int side) {
        this.side = side;
    }
}

public class cube_shape {
    public static void main(String[] args) {
        cube C=new cube();
        C.setSide(5);
        System.out.println("the volume of the cuBe is=");
        System.out.println(C.getSide());
        
    }
}
