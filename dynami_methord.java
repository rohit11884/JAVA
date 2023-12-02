class phone{
    public void on(){
        System.out.println("Phone is on");
    }
}
class smartphone extends phone{
    public void on(){
        System.out.println("Smart phone is on");
    }
}

public class dynami_methord {
    public static void main(String[] args) {
        phone ob=new smartphone();
         ob.on();   // It will invoke methord of sub class

        // smartphone ob2=new phone();   // we can not do this

       
    }
    
}
