public class Main {

    public static Employee[] employee = new Employee[10];
    public static Person[] person = new Person[10];

    public static void main(String[] args) {



        person[0] = new Person("Bob", "Bobovich", "Bobov");
        person[1] = new Person("Bill", "Billovich", "Billov");
        person[2] = new Person("Andrew", "Ivanovich", "Voroshilov");
        person[3] = new Person("Iosif", "Vissarionovich", "Stalin");
        person[4] = new Person("Gena", "Pavlovich", "Bukin");

        employee[0] = new Employee(person[0], 35000, 3);
        employee[1] = new Employee(person[1], 25000, 4);
        employee[2] = new Employee(person[2], 375000, 1);
        employee[3] = new Employee(person[3], 75600, 1);
        employee[4] = new Employee(person[4], 66500, 5);



        listOfEmployees();
        System.out.println();

        int totalSalary = totalSalary();
        System.out.println("Затраты на ЗП: " + totalSalary + " рублей.");
        System.out.println();

        Employee minSalary = minSalary();
        System.out.println("Сотрудник с минимальной зарплатой - " + minSalary.toString());
        System.out.println();

        Employee maxSalary = maxSalary();
        System.out.println("Сотрудник с максимальной зарплатой - " + maxSalary.toString());
        System.out.println();

        int averageSalary = averageSalary();
        System.out.println("Средняя зарплата: " + averageSalary + " рублей.");
        System.out.println();

        listOfNames();


    }

    public static void listOfEmployees() {
        System.out.println("Список сотрудников:");
        for (int i = 0; i < employee.length - 1 && employee[i] != null; i++) {
            System.out.println(employee[i].toString());
        }
    }

    public static int totalSalary() {
        int sum = 0;

        for (int i = 0; i < employee.length -1 && employee[i] != null; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }

    public static Employee minSalary() {
        int min = employee[0].getSalary();
        Employee employeeWithMinSalary = employee[0];

        for (int i = 0; i < employee.length - 1 && employee[i] != null; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
                employeeWithMinSalary = employee[i];
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee maxSalary() {
        int max = employee[0].getSalary();
        Employee employeeWithMaxSalary = employee[0];

        for (int i = 0; i < employee.length - 1 && employee[i] != null; i++) {
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
                employeeWithMaxSalary = employee[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public static int averageSalary() {
        int sum = 0;
        int numberOfEmployees = 0;

        for (int i = 0; i < employee.length -1 && employee[i] != null; i++) {
            sum += employee[i].getSalary();
            numberOfEmployees++;
        }
        double averageSalary = (double) sum / numberOfEmployees;
        return (int) averageSalary;
    }

    public static void listOfNames() {
        System.out.println("ФИО всех сотрудников:");
        for (int i = 0; i < employee.length - 1 && employee[i] != null; i++) {
            System.out.println(employee[i].getPerson().toString().replaceAll("ФИО сотрудника: ", ""));
        }
    }

}
