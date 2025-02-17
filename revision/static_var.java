package revision;
public class static_var {
    static int num =1; // (Static) will gets memory once and retain its value
    static_var(){
        num++;
        System.out.println("The numbers are:\n" +num);
    }
    public static void main(String[] args) {
        static_var obj =new static_var();
        static_var obj1 =new static_var();
        static_var obj2 =new static_var();
    }
}
