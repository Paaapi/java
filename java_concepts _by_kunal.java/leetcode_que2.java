public class leetcode_que2 {
    public static void main(String[] args) {
        
    }
    public int maxwealth(int[][] accounts) {
        int max=0;
        for(int person =0;person<accounts.length;person++){
            int sum =0;
            for(int account =0;account < accounts[person].length;account++){
                  sum += accounts[person][account];
            }
            if(sum >max){
                 max=sum;
            }
            
        }return max;
    }
}
