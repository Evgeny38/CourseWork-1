public class Employee {
    private static int counter = 1;
    private Integer id;
    private String name;
    private String middleName;
    private String surName;
    private int department;
    private int salary;



    public Employee(String name, String middleName, String surName, int department, int salary) {
        this.id = counter++;
        this.name = name;
        this.middleName = middleName;
        this.surName = surName;
        this.department = department;
        this.salary = salary;

    }
    public Integer getId() { return this.id; }

    public String getName() { return name; }

    public String getMiddleName() { return middleName; }

    public String getSurName() { return surName; }

    public int getDepartment() { return department; }

    public int getSalary() { return salary; }

    public void setDepartment(int department) { this.department = department; }

    public void setSalary(int salary) { this.salary = salary; }

    @Override
    public String toString() {
        return  "ID: " + id + "; " +"ФИО сотрудника: " + name + " "+ middleName + " "
                + surName + "; Отдел: " + department + "; Зарплата: " + salary + ".";
    }
}
