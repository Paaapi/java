public class Recursion_Intro {
    public static void main(String[] args) {
        // its just a number Example to understand funct calling Internally.

        //Write a function that takes in number and print it.
        // print numbers from 1 to 5.
        print(1);
    }

    static void print(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }

}
