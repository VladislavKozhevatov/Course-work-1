public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Николаев Пётр Сергеевич", 1, 48000);
        employees[1] = new Employee("Иванов Сергей иванович", 1, 69000);
        employees[2] = new Employee("Семёнов Андрей Петрович", 2, 67000);
        employees[3] = new Employee("Антонов Михаил Сергеевич", 2, 100000);
        employees[4] = new Employee("Рудаков Анатолий Петрович", 2, 54000);
        employees[5] = new Employee("Гаврилов Сергей Анатольевич", 3, 44000);
        employees[6] = new Employee("Панфилоа Алексей Семёнович", 3, 67000);
        employees[7] = new Employee("Талапин Вадим Евгеньевич", 4, 48000);
        employees[8] = new Employee("Короленко Вячеслав Петрович", 4, 89000);
        employees[9] = new Employee("Васильев Василий Васильевич", 5, 99000);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static int calculateSumOfSalaries() {
        int sumSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}

