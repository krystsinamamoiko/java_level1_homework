package lesson05;

public class HomeWorkAppLesson05 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван Иванович Иванов", "Java программист", "ivan.ivanov@mail.ru", "+375(29)5672867", 15000, 32);
        employees[1] = new Employee("Петров Петр Петрович", "Junior QA специалист", "petr.petrov@mail.ru", "+375(29)6675867", 5000, 25);
        employees[2] = new Employee("Степан Степанович Степанов", "Middle QA специалист", "stepan.stepanov@mail.ru", "+375(29)7672567", 7000, 35);
        employees[3] = new Employee("Александр Александров Александрович", "Senior QA специалист", "alex.alex@mail.ru", "+375(29)2671167", 10000, 45);
        employees[4] = new Employee("Кирилл Краснов Николаевич", "QA Lead", "kirill.krasnov@mail.ru", "+375(33)5642467", 15000, 53);

        for(int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].employeeInfo();
            }
        }
    }
}
