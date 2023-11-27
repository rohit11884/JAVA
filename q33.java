class myemployee{
    String name;
    int id;
   public myemployee(String myname,int MyId){
    name=myname;
    id=MyId;

    }
   public myemployee(){
    name="Rohit bhai";
    id=13;

    }
}


public class q33 {
    public static void main(String[] args) {
        myemployee em=new myemployee("Rohit", 12);
        myemployee em1=new myemployee();
        System.out.println(em.name);
        System.out.println(em.id);
        System.out.println(em1.name);
        System.out.println(em1.id);

    }
    
}
