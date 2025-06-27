public class classbtyexl {
    public static void main(String[] args) {
        System.out.println(print(75));
        
    }
    static int print(int num){
        if(num % 3 ==0 && num % 5==0){
            return 35;
        }
        else if(num%3==0){
            return 3;
        }
        else if(num %5==0){
            return 5;
        }
        return -1;
    }
}
