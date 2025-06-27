class data{
   private int num;
    private String name;
    
    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

}


public class accessmodifier{
    public static void main(String[] args) {

    data mew=new data();
    
        
        mew.setName("Paravdeep");
        mew.setNum(16815);
        System.out.println(mew.getName());
        System.out.println(mew.getNum());
//        System.out.println("I help teams to become more effective and juniors to grow");
//        System.out.println("#tdeveloper #learner #softskills #writing #opensource");
//        System.out.println("#javadev #fullstack #springboot #reactjs #cloud #microservices");


    }
}