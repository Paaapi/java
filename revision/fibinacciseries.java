package revision;
public class fibinacciseries {
    public static void main(String[] args) {
        // it is without recursion 
        int n1=0,n2=1,n3,count=11;
        System.out.println("The fibonacci series=");
        System.out.print(n1+" "+n2);
        for(int i=2;i<count;++i){
            n3=n1+n2;
            System.out.print(" "+n3);
         // value of new n2 is stores in n1 an dthr value of n3 is stores in n2
            n1=n2;
            n2=n3;
        }
    }
}