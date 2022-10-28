import java.util.Arrays;

public class Easy {
    public static  Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        System.out.println("Книга сотрудников. Базовый уровень.");

        Employee pers1= new Employee("Иван", "Иванович","Иванов",1,15000) ;
        Employee pers2= new Employee("Петр", "Петрович","Петров",2,16000) ;
        Employee pers3= new Employee("Сидор", "Сидорович","Сидоров",4,17000) ;
        Employee pers4= new Employee("Магомед", "Магомедович","Магамедов",5,18000) ;
        Employee pers5= new Employee("Снежанна", "Денисовна","Плейбоева",3,150000) ;
        Employee pers6= new Employee("Херанука", "Савсейдури","Параялю",5,125000) ;
        Employee pers7= new Employee("Ганс", "Маразмус","Трахтенбюргер",2,200000) ;
        Employee pers8= new Employee("Жан", "Поль","Рукосуев",1,35000) ;
        Employee pers9= new Employee("Сюзанна", "Артуровна", "Непейпиво", 3, 153500);
        Employee pers10= new Employee("Мерлин", "Алексеевна","Горячая",3,150000) ;

        employees[0] = pers1;
        employees[1] = pers2;
        employees[2] = pers3;
        employees[3] = pers4;
        employees[4] = pers5;
        employees[5] = pers6;
        employees[6] = pers7;
        employees[7] = pers8;
        employees[8] = pers9;
        employees[9] = pers10;


        Arrays.stream(employees).forEach(System.out::println);
        System.out.println("Максимальная зарплата :  " +employeeMaxSalary());
        System.out.println("Минимальная зарплата : " + employeeMinSalary());
        System.out.println("Суммарная зарплата : " + calculateTotalSalary());
        System.out.println("Средняя зарплата : " + calculateAverageSalary());



//        Employee[] pers = Arrays.copyOf(employees, 10);
//        Arrays.stream(pers).forEach(System.out::println);
//        //System.out.println(pers.length);


    }
    public static void printEmployee(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary( ){
        int sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }
    public static int calculateAverageSalary() {
        return calculateTotalSalary() / employees.length;
    }

    public static Employee employeeMinSalary(){
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee employeeMaxSalary() {
        Employee result = employees [0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee ;
            }
        }
        return result;
    }
    public static void printList() {
        for (Employee employee : employees) {
            System.out.println(employee.getSurName());
        }

    }



}