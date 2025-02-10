public class internal_swap {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        swap(a,b);          // why it is not swap ? bcause a is reference variable which is pointing towards an object 20 in swap method 
        System.out.println(a +" "+b);

        String naam="Paravdeep Walia";
        greet(naam);   // u can write anything here in place of naam.

        String naaam="Parav";
        change(naaam);          // this  not change naaam because in naame method naame is now pointing towards different obj "Walia" rather than "Parav"
        System.out.println(naaam);
    }

    static public void swap(int a,int b){
        int temp =a;
            a =b;
            b =temp;
    }
    static public void greet(String name){
        System.out.println(name); // basically this name has a copy of reference variable's value, they both pointing towards 1 obj.
    }
    static public void change(String naame){
        naame ="Walia";
    }
}
