class A{
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("This is methord 2 of class A");
    }
}
class B extends A {
    public void meth2(){
        System.out.println("This is methord 2 of class B");
    }
}
public class methord_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
        
    }
}
