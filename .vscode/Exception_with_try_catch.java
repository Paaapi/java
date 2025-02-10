public class Exception_with_try_catch {
    public static void main(String[] args) {
        int a=544;
        int b=0;
        try{
            int c=a/b;
            System.out.println("the obtained result is=" + c);
        }
        catch(Exception e){
            System.out.println("we failed to get result");    // Becuse the value b is assigned 0.
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
