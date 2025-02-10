public class methodsinjava {
  static int logic(int x,int y){
    int z;
    if(x>y){
        z=x+y;
    }
    else{
        z=(x+y)*4;
    }
    return z;

 }
    public static void main(String[] args) {
        int a=34;
        int B=10;
        int c=logic(a,B);
        System.out.println(c);
        
        int q=9;
        int w=10;
        int e=logic(q,w);
        System.out.println(e);

    }
}
