import java.util.ArrayList;

public class find_factors {
    public static void main(String[] args) {
        int n=20;
        factor(n);
    }
    static void factor(int n){ // to sort this we can use array list to add factors
        ArrayList <Integer> list =new ArrayList<>();
                for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                if(n/i == i){
                System.out.println(i);
            }
            else{
                 System.out.println(i);
            }
            list.add(n/i);
            }
            
            }
            for(int j=list.size()-1;j>=0;j--){
                System.out.println(list.get(j));
        }
    }
}
