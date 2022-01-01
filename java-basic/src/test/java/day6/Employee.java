package day6;

public class Employee {
    int id;
    String name;
    double salary;
    String job;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double calfullSalary(){
        return this.getSalary() * 12;
    }

    @Override
    public String toString(){
        return  "ID: " + this.getId() + "; Name: " + this.getName() + " ;Salary: " + this.getSalary() + " ;Job: " + this.getJob();
    }



}
