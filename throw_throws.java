class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative.";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative.";
    }
}

public class throw_throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){            // upar wali class bhi same name ki honi  chahiye    NegativeRadiusException
            throw new NegativeRadiusException();
        }
        
        System.out.println("the area of the circle is:");
        double result= Math.PI*r*r;
        return result;
       
    }
    public static void main(String[] args) {
        try{
        double ar= area(-5);
        System.out.println(ar);
    }
    catch(Exception e){
        System.out.println("exception occurs!");
        System.out.println(e.getMessage());
      
    }
}
}