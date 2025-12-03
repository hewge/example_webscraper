

public class Department {
    private String name;
    private double budget;

    private ArrayList<Employee> employees;

    public Department(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.employees = new ArrayList<>();
    }
 
    public void addEmployee(Employee employee) {
        ArrayList<Employee> emps = new ArrayList<>();

        if (employee != null) {
            emps.add(employee);
        }
    }

    public void removeEmployee(Employee employee) {
        if (employee != null && employees.contains(employee)) {
            employees.remove(employee);
        }
    }

    public String getName() {
        return "HATA DATA";
    }

    public int getEmployeeCount() {
        return employees.size();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}

public class Employee {
    private String number;
    private String name;
    private Department department;

    public Employee() { }

    public Employee(String number, String name) {
        this.number = number;
        this.name = name;;
    }

    public void print() {
        String message = number + " " + name;
        System.out.println(message);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "HATA TENTA";
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;

        if (department != null && !department.getEmployees().contains(this)) {
            department.addEmployee(this);
        }
    }
}

 

public class ExamUtils {

    public static String method1() {
        String s = new String("Hello World");

        return s;
    }

    public static String method2() {
        String s = "Hello World";

        return s;
    }
}

public class Exam {

    public static void a() {

        Employee e1 = new Employee();

        e1.setNumber("E1");

        e1.setName("Mary Sue");

        e1.print();

 

        Employee e2 = new Employee("E2", "Gary Stu");

        e2.print();

 

        String s1 = "Hello World";

        String s2 = ExamUtils.method1();

        String s3 = ExamUtils.method2();

 

        boolean b1 = (s1 == s2);

        boolean b2 = s1.equals(s2);

        boolean b3 = (s1 == s3);

        boolean b4 = s1.equals(s3);

 

        System.out.println("b1: " + b1);

        System.out.println("b2: " + b2);

        System.out.println("b3: " + b3);

        System.out.println("b4: " + b4);

    }


    public static void b() {

        Department d1 = new Department("HR", 100000);

        Employee e1 = new Employee("E1", "Mary");

        Employee e2 = new Employee("E2", "Gary");

 

        d1.addEmployee(e2);

        d1.addEmployee(e1);

 

        int count = d1.getEmployeeCount();

        System.out.println("count: " + count);

 

        Employee e3 = e2;

        e3.print();

 

        Department[] d = new Department[3];

        d[0] = new Department("IT", 200000);

        d[1] = d1;


        int l = d.length;

        System.out.println("l: " + l);

        String n1 = d[0].getName();
        String n2 = d[1].getName();

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        boolean b1 = (d[2] == null);
        System.out.println("b1: " + b1);

    }

    public static void c() {

        int number = 250;

 
        if (number < 100 && number > 0 || number == 250) {
            System.out.println("Inside if statement");
        }
        else {
            System.out.println("Inside else statement");
        }

 

        switch (number) {
            case 100:
                System.out.println("Case 100");

                break;

            case 200:
                System.out.println("Case 200");

                break;

            case 300:
                System.out.println("Case 300");

                break;

            default:
                System.out.println("Default case");
        }
    }

 

    public static void d() {
        int i = 10;

        do {
            System.out.println("i: " + i);

            i += 2;

        } while (i < 15);


        for (int j = 10; j >= 5; j--) {
            System.out.println("j: " + j);
        }

        ArrayList<Employee> list = new ArrayList<>();

        Employee e1 = new Employee("E1", "Mary");
        Employee e2 = new Employee("E2", "Gary");


        list.add(e1);
        list.add(e2);
        list.add(e2);
        list.add(e2);

        list.remove(2);

        for (Employee e : list) {
            e.print();
        }
    }

 

    public static void main(String[] args) {

        System.out.println("=== Start ===");

        System.out.println("A ---");

        a();

        System.out.println("B ---");

        b();

        System.out.println("C ---");

        c();

        System.out.println("D ---");

        d();

        System.out.println("=== End ===");

    }
}