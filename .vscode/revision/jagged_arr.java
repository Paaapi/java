package revision;
public class jagged_arr {
    public static void main(String[] args) {
        int mat[][]=new int[3][];
        mat[0]=new int[2];
        mat[1]=new int[3];
        mat[2]=new int[5];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j]= (int)(Math.random() *100);
            }
        
        }
        for (int a[]: mat) {
            for (int r : a) {
                System.out.print(r +" "); 
            }
            System.out.println();
            
        }
    
    }
}
