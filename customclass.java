class student{
    int uid;
    String name;
    int salary;
    public void getprint(){
        System.out.println("the name of person is:"+name);
                System.out.println("the UID of person is:"+uid);

    } 
    public int getsalary(){
        return salary;
    }
}
public class customclass {
    public static void main(String[] args) {
        student info=new student();
        info.salary=35;
        info.uid=2216815;
        info.name="Paravdeep";
         info.getprint();
    // System.out.println(info.name);
    // System.out.println(info.uid);
    System.out.println(info.salary);

    }
}
