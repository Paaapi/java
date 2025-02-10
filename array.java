public class array {
    public static void main(String[] args) {
        /*there are three main ways to create the array:-
         * 1.Declaration  and memory allocation.
         * int []marks=new int[5];
         * 
         * 2. Declaration  and then memory allocation .
         * int []marks;
         * marks=new int[5];
         * initialization
         * marks[0]=34;
         * marks[1]=84;
         * marks[2]=74;
         * marks[3]=56;
         * marks[4]=64;
         * 3.Declaration, memory allocation and initialization together.*/
          int marks[]={24,55,66,87,45}; 
          System.out.println(marks[3]);  

          //displaying array using for loop
          int uid[]={21,22,23,24,25};
          for(int i=0;i<uid.length;i++){
            System.out.println(uid[i]);

            // displaying using for Each loop (agr sidhe hi print karane hai toh yeh efficent way hai..)
            for(int ele:uid){
                System.out.println(ele);
            }
          }

    }
}
