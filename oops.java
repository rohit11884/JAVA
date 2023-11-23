class Employee{
    int id;
    String name;
    int salary;
    public void printdetail(){
        System.out.println("My Name is "+ name);
        System.out.println("My ID is "+id);
        System.out.println("My salary is "+salary);
    }
   
}
public class oops {
     public static void main(String[] args) {
        Employee em1=new Employee();
        Employee em2=new Employee();
        em1.name="Rohit";
        em1.id=12;
        em2.name="Akash";
        em2.id=14;
        em1.salary=2000000;
        em2.salary=3000000;
        em1.printdetail();
        em2.printdetail();
       
        
    }
}
