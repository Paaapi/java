
public class arraypracticeset {
    public static void main(String[] args) {
        //Practice que 1
       /* * Float num[]={1.2f,35.2f,34.5f,67.5f,78.4f};
        Float sum=0.f;
        for(Float e:num){
            sum +=e;
            
        }
        System.out.println("the sum of element is: "+sum);*/

        //Practice que 2
       /*  int marks[]={12,34,56,35,23};
        int num=314;
        Boolean IsinArray =false;
        for(int e:marks){
        if(num==e){
            IsinArray=true;
            break;
        }
    }
    if(IsinArray){
        System.out.println("this value is true.");
    }
    else{
        System.out.println("this value is false");*/

        //Practice que 3
      /*  Float num[]={1.2f,35.2f,34.5f,67.5f,78.4f};
        Float sum=0.f;
        for(Float e:num){
            sum +=e;
            
        }
        System.out.println("the average  sum of element is: "+sum/num.length);*/

        //Practice que 4
       /*  int mat1[][]={{1,2,3},
                       {4,5,6}};
        int mat2[][]={{6,8,7},
                       {9,0,1}};
         int result[][]={{0,0,0},
                          {0,0,0}};

              for(int i=0;i<mat2.length;i++){
                for(int j=0;j<mat2[i].length;j++){
                    result[i][j]= mat1[i][j] + mat2[i][j];
                    System.out.print(+result[i][j]+ " ");
                }
                System.out.println( );

              }  */ 
              //left with que swap and min and max
              //Practice que 8
              int a[]={1,3,6,55,71,84};
              Boolean ISsorted=true;
              for(int i=0;i<a.length-1;i++){
                if(a[i]>a[i+1]){
                 ISsorted=false;
                 break;
                }
        
              }
                     if(ISsorted){
                        System.out.println("the array is sorted..");
                     }
                     else{
                        System.out.println("the array is not sorted..");
                     }
    }
    
}
