public class Pattern_que {
    public static void main(String[] args) {
        //pattern(4);
        //pattern_28(5);
        //pattern30(5);
        pattern31(5);
    }
    static void pattern(int n){
        for(int row=0;row <=2*n-1;row++){
            int total_col= row > n ? 2*n - row : row; // this is also an method to apply if else condition.
            for(int col=0;col<total_col;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void pattern_28(int n){
        for(int row=0;row <=2*n-1;row++){
            int total_col= row > n ? 2*n - row : row; // this is also an method to apply if else condition.
            int spaces= n - total_col;

            for (int s=0;s<=spaces;s++){
                System.out.print(" ");
            }
            
            for(int col=0;col<total_col;col++){
                System.out.print("* ");
            }
            System.out.println("");
    }
    }

    static void pattern30(int n){
        
        for(int row=1;row<=n;row++){
            for(int spaces=0;spaces<n - row;spaces++){
                System.out.print("  ");
            }

            for(int col=row;col>=1;col--){
                System.out.print(col +" ");
            }

            for(int col=2;col<=row;col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
        
        
    }
    static void pattern31(int n){
        for(int row=1;row< 2 * n;row++){
            for(int col=1;col<2 * n;col++){
                int real_n=n;
                int index=real_n - Math.min(Math.min(row, col),Math.min(2*n-col, 2*n - row));
               // int index=Math.max(Math.max(row, col),Math.max(2*n-col, 2*n - row));
                System.out.print(index +" ");
            }
            System.out.println();
        }
    }
}