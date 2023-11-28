class Base{
    int x=10;
}
class Derived extends Base{
    int y=13;
}
class Child extends Derived{
    int z=98;
}

public class inheritance {
    public static void main(String[] args) {
        Child ch=new Child();
        System.out.println(ch.x);
    }
    
    
}
