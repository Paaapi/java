package revision;
public class multiarray {
    public static void main(String[] args) {
        int matrix[][]= new int [4][4]; // one method is we fill the values manually which is time consuming and another one by random function in java.
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
           matrix[i][j]= (int)(Math.random() *100);
           // math.random gives double value to convert it in int we multiply it with 100 ti geet 2 digit and then by (int) to aviod the error of incompatibility.
            }
        
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        // we can  use enhanced for loop 
       /* for(int arr[]:matrix){
            for(int m:arr){
                System.out.print(m +" ");

            }
            System.out.println("");
        }
        */ 
    }
}
