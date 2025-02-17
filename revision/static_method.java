package revision;
class info{
    int uid;
    String name;
    static int age =19;
    static void change(){
        age=20;     // this mthod can change the value of Static variable. 
    }
    info(int u,String n){
        uid=u;
        name=n; 
    }
    public void show(){
        System.out.println(uid+" "+name+" "+age);
    }
}
    public class static_method {

    public static void main(String[] args) {
        info.change();// calling change method 
        info o1=new info(16815,"Paravdeep");
        info o2=new info(16813, "chakshit");
        o1.show();
        o2.show();
        //The static method can not use non static data member or call non-static method directly.
       //this and super cannot be used in static context.
    }
} 