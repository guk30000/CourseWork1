import java.util.Objects;

public class Employee {

    private Person person;
    private int salary;
    private int department;
    private int id;

    private static int counter = 1;


    public Employee(Person person, int salary, int department) {
        this.person = person;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    public Person getPerson() {
        return person;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return person.toString() + ". Зарплата: " + salary + ". Отдел: " + department + ". Id: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(salary, employee.salary) && Objects.equals(department, employee.department) && Objects.equals(person, employee.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, salary, department);
    }
}
