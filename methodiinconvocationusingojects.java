public class methodiinconvocationusingojects {
    int logic(int x,int y){               //static keyword use nahi kiyaa 
        int z;
        if(x<y){
            z=x+y;
        }
        else{
            z=(x+y)*3;
           
        }
                
        return z;
    }
    public static void main(String[] args) {
        //method inconvocation using ojects
       //methodiinconvocationusingojects oBj= new methodiinconvocationusingojects();
       int a=2;
       int B=32;
      
       methodiinconvocationusingojects oBj=new methodiinconvocationusingojects();
       int c=oBj.logic(a,B);
       System.out.println(c);
        
    }
}
