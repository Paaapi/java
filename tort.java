import java.util.Random;
public class tort {
    public static void main(String[] args) {
        int tortiosepos=0;
        int raBBpos=0;

        Random ran= new Random();
        System.out.println("Get Set Go.");
        while(raBBpos <35 && tortiosepos <35){
            int tortiosestep=ran.nextInt(11);
            int rabbitPos=ran.nextInt(11);

            if(tortiosestep<4){
                tortiosepos+=1;
            }
            else if(rabbitPos<2){
                raBBpos+=0;
            }
            else if(rabbitPos<5){
                raBBpos+=10;
            }
            else{
                raBBpos+=1;
            }
            for(int i=0;i<35;i++){
                if(i==tortiosepos && i== raBBpos){
                    System.out.println("Run Fast u Have To Win THe Race.");
                }
                else if(i== tortiosepos){
                    System.out.println("tort on lead");
                }
                else{
                System.out.println("raB on lead.");
                }
            }
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException s){
                s.printStackTrace();
            }
          
            
               }

               if (tortiosepos >= 50 && raBBpos >= 50) {
                System.out.println("It's a tie!");
            } else if (tortiosepos >= 50) {
                System.out.println("The tortoise wins!");
            } else {
                System.out.println("The rabbit wins!");
            }
    }
    
}
