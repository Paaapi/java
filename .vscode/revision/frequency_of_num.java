package revision;
import java.util.Scanner;
public class frequency_of_num {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the size of array= ");
         int n = s.nextInt();
         int ar[] =new int[n];
         for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
         }
        int m= s.nextInt();

        int ar2[]=new int[m];
        int freq[]=new int[m];
        for(int i=0;i<m;i++){
            ar2[i]=s.nextInt();
        }
        for(int i=0;i<m;i++){
            freq[i]=0;
           for(int j=0;j<n;j++){
              if(ar2[i]==(ar[j])){
                freq[i]++;
                }
            }
    }
        for(int i=0;i<m;i++){
            System.out.println(freq[i]);
        }
        s.close();
    }
}
