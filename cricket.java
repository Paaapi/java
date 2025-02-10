class cricketplayer{
   
   private String Batsman;
   public String getBatsman() {
       return Batsman;
   }
   public void setBatsman() {
       if( Batsman=="kohli"){
         System.out.println("yeah correct Batsman");
       }
       else{
        System.out.println("False");
       }
   }

    private String Bolwer;
    public String getBolwer() {
        return Bolwer;
    }
    public void setBolwer() {
       if(Bolwer=="Bhuvensh"){
         System.out.println("correct Bolwer");
        }
        else{
            System.out.println("false");
        }
    }
    
    


}


public class cricket {
    public static void main(String[] args) {
        cricketplayer cri=new cricketplayer();
        System.out.println(cri.getBatsman());
        System.out.println(cri.getBolwer());
    }
}
// duarBAra b nana hai