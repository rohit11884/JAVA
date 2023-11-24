class Employee{
    int salary;
    String name;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
}
public class practiceset {
    public static void main(String[] args) {
        Employee em =new Employee();
        em.setName("Rohit");
        em.getName();
        System.out.println(em.getName());
        em.setSalary(123444555);
        em.getSalary();
        System.out.println(em.getSalary());
    }
    
    

}
