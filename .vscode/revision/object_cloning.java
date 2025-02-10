package revision;
class Base {
    public static Object obj1;
        int i,j;
        int sum=0;
        public void add(){
            sum = i + j;
            System.out.println("the sum of two numbers id=" + sum);
        }
    }
    public class object_cloning {
        public static void main(String[] args) {
            Base obj =new Base();
            obj.i=34;
            obj.j=30;
            obj.add();
            Base.obj1 =obj.clone();

    }
}
