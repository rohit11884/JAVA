class Employee{
    int id;
    String name;
    public void printdetail(){
        System.out.println("My ID is "+id);
        System.out.println("My Name is "+ name);
    }
   
}
public class oops {
     public static void main(String[] args) {
        Employee em1=new Employee();
        Employee em2=new Employee();
        em1.id=12;
        em1.name="Rohit";
        em1.printdetail();
        
    }
}
