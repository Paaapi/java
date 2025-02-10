
class animal{
    int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Dog extends animal{
    String voice;
    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
}
public class inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setAge(3);
        System.out.println(d.getAge());
        d.setVoice("Barking"); 
        System.out.println(d.getVoice());
    }
}
