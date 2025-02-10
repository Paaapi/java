package revision;
public class Pascal {
public static void main(String[] args) {
    int n=5,i,x=1;
    for(i=0;i<=n;i++){
         for(int j=1;j<=n-1;++j){
             System.out.print(" ");
         }
            for( int k=0;k<=i;k++){
                if(k==0 || i==0)
                  x=1;
                 else
                 x=x*(i-k+1)/k;
                 System.out.printf("%4d",x); 
                 
            
          }
    System.out.println();
    }
}}

