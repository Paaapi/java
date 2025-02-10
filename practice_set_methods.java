public class practice_set_methods{
    static void multiplication(int n){
        for(int i=0;i<10;i++){
            System.out.println(i*n);
        }
    }
    //practice que 2
    static void pattern(int p){
        for(int i=0;i<p;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    //practice que 3
    static int sumrec(int s){
        if(s==1){
            return 1;
        }
        else{
           
               return s + sumrec(s-1);
        }
    } 
    //practice que 5
    static int fiB(int n){
        //fiBonaci series=0 1 1 2 3 5 8 13 21 34 .. .....
                if(n==1 || n==2){
            return n-1;
        }
        else{
            return fiB(n-1)+fiB(n-2);
        }
    }
    public static void main(String[] args) {
multiplication(5);
pattern(5);

System.out.println(sumrec(6));
System.out.println(fiB(5));
    }
}