package lesson05;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String fio, String position, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInfo() {
        System.out.println("ФИО сотрудника: " + fio);
        System.out.println("Должность сотрудника: " + position);
        System.out.println("Email сотрудника: " + email);
        System.out.println("Телефон сотрудника: " + phone);
        System.out.println("ЗП сотрудника: " + salary);
        System.out.println("Возраст сотрудника: " + age);
        System.out.println("-------------------------------------");
    }
}
