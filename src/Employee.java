import java.util.Objects;

public class Employee {

    private int id;
    private String fullName ;
    private int department ;
    private  int salary;
    private static int idNumber=1;


    public Employee(String fullName, int department, int salary) {
        id = idNumber++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id =" + id +
                ", Имя сотрудника = " + fullName + '\'' +
                ", отдел = " + department +
                ", зарплата = " + salary + " рублей";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }
}
