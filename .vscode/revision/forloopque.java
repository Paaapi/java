package revision;
/*
public class forloopque {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
//printing pyramidal strucof "*"
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
*/
public class forloopque{
    public static void main(String[] args) {
        
        for(int m=1;m<=6;m++){
// reverse order pyramidial struc
            for(int n=6;n>=m;n--){
               System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}