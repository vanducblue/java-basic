package day6;

public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("vduc");
        emp1.setSalary(6000);
        emp1.setJob("manager");

        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
        System.out.println(emp1.getJob());

        System.out.println(emp1);
        System.out.println(emp1.calfullSalary());

        Employee emp2 = emp1;
        emp2.setSalary(4000);
        emp2.setJob("Staf");

        System.out.println(emp2);
        System.out.println(emp2.calfullSalary());
    }
}
