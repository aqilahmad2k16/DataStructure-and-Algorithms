package Test1;

public class OOps extends SpringBoot {
    void display(){
        System.out.println("Hey there! I am going to learn about springboot");
    }
    public static void main(String[] args) {
        OOps a = new OOps();
        a.display();
    }
}

class SpringBoot{
    private void display(){
        System.out.println("I am doing core java");
    }
}
