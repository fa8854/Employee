import java.util.Scanner;
public class Main {
    static final int dep = 1;
    static final double salaryMin = 2000;
    static final double salaryMax = 30000;
    static final double index = 0.3;
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        addEmployee();
        sumMouthSalary();
        minSalary();
        maxSalary();
        salaryMiddle();
        eployeefio();
        indexSalary();
        departmetsSum();
        departmetsMin();
        departmetsMax();
        departmetsMiddleSalary();
        departmentsIndexSelary();
        departments();
        salaryMin();
        salaryMax();
    }
    public static void addEmployee(){
       System.out.println("Список сотрудников");
       for (int i=0; i <= employees.length -1 ;i++){
           employees[0] = new Employee("Фили Моррис Иванович", 1,2000);
            employees[1] = new Employee("Александрова Татьяна Александровна", 1,2000);
            employees[2] = new Employee("Крытов Александр", 1,2000);
            employees[3] = new Employee("Иванов Иван", 3,2000);
            employees[4] = new Employee("Максим Самарцев", 4,100);
            employees[5] = new Employee("Алексей Веселов", 5,51500);
            employees[6] = new Employee("Александр Сидоренков", 4,30000.500);
            employees[7] = new Employee("Максим Глушаков", 2,12000);
            employees[8] = new Employee("Данил Оводов", 1,2000);
            employees[9] = new Employee("Корытко Александр", 2,34000);
            System.out.println(employees[i]);
                        }
       System.out.println();
   }
    public static void sumMouthSalary(){
        double sum = 0;
        for (int i =0; i<= employees.length - 1;i++){
           sum =sum + employees[i].getSalary();
        }
           System.out.println("Сумма затрат на зарплату в месяц : " + sum);
           System.out.println();
       }
    public static void minSalary(){
        double min=900000;
        for (int i = 0; i <= employees.length-1; i++){
            if(employees[i].getSalary() < min) {
                min =employees[i].getSalary();
            }
        }
           System.out.println("Минимальная зарплата : " + min);
           System.out.println();
       }
    public static void maxSalary(){
           double max = 0;
           for (int i = 0; i <= employees.length - 1; i++){
               if(employees[i].getSalary() > max) {
                   max =employees[i].getSalary();
               }
           }
           System.out.println("Максимальная зарплата " + max);
           System.out.println();
       }
    public static void salaryMiddle(){
        double sum = 0;
        double middle = 0;
        for (int i =0; i<= employees.length - 1;i++){
            sum =sum + employees[i].getSalary();
        }
        middle = sum / employees.length;
        System.out.println("Средняя зарплата : " + middle);
        System.out.println();
    }
    public static void eployeefio(){
           System.out.println("Список Ф.И.О. сотрудников");
           for (int i = 0 ; i<= employees.length - 1; i ++){
            System.out.println(employees[i].getFio());
        }
           System.out.println();
       }

    public static void indexSalary(){
        System.out.println("Индексация зарплат сотрудников");
           for (int i =0; i<= employees.length - 1;i++){
               employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary()* index);
               System.out.println("Зарплата увеличена " + employees[i].getFio() + " " + employees[i].getSalary() );
           }
           System.out.println();

       }

    public static void departments(){
           System.out.println("Сотрудники по отделам");

                    for (int i =0; i<= employees.length- 1;i++){

                       if (employees[i].getDepartment() == dep){
                               System.out.println(employees[i].getFio()+ " " + employees[i].getSalary());
                       }
                   }

           System.out.println();
       }
       public static void departmetsMin(){
        int numb=0;
           double min = 90000;
           for (int i =0; i<= employees.length- 1;i++){
                if (employees[i].getDepartment() == dep){
                    employees[i].setId(numb++);

                    System.out.println(employees[i]);
                    if (employees[i].getSalary() < min){
                       min = employees[i].getSalary();
                   }
               }
       }
           System.out.println("Минимальная зарплата по отделу "+ min);
           System.out.println();
    }
    public static void departmetsMax(){
        int numb=0;
        double max = 0;
        for (int i =0; i<= employees.length- 1;i++){
            if (employees[i].getDepartment() == dep){
                employees[i].setId(numb++);
                System.out.println(employees[i]);
                if (employees[i].getSalary() > max){
                    max = employees[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата по отделу "+ max);
        System.out.println();
    }
    public static void departmetsSum(){
        int numb=0;
        double sum = 0;
        for (int i =0; i<= employees.length- 1;i++){
            if (employees[i].getDepartment() == dep){
                employees[i].setId(numb++);
                System.out.println(employees[i]);
                sum =sum + employees[i].getSalary();
                }
        }
        System.out.println("Сумма зарплаты по отделу " + sum);
        System.out.println();
    }
    public static void departmetsMiddleSalary (){
        int numb=0;
        double middle =0;
        int department = 0;
        double sum = 0;
        for (int i =0; i<= employees.length- 1;i++){
            if (employees[i].getDepartment() == dep){
                employees[i].setId(numb++);
                System.out.println(employees[i]);
                department = department + 1;
                sum =sum + employees[i].getSalary();
                middle = sum / department;
            }
        }
        System.out.println("Средняя зарплата по отделу : " + middle);
        System.out.println();
    }
    public static void departmentsIndexSelary(){
        System.out.println("Зарплата сотрудникам проиндексирована");
        int numb=0;
        int department = 0;
        double index = 0.05;
        for (int i =0; i<= employees.length- 1;i++){
            if (employees[i].getDepartment() == dep){
                employees[i].setId(numb++);
                department = department + 1;
                System.out.println(employees[i]);
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary()* index);
                System.out.println("Зарплата увеличена " + employees[i].getFio() + " " + employees[i].getSalary() );
            }
        }
       System.out.println();
    }
    public static void salaryMin(){
        System.out.println("Зарплата сотрудников меньше или равнв " + salaryMin);
        int numb=0;
        for (int i =0; i<= employees.length- 1;i++){
            if (employees[i].getSalary() <= salaryMin ){
                employees[i].setId(numb++);
                System.out.println(employees[i]);
            }
        }
        System.out.println();
    }
    public static void salaryMax(){
        System.out.println("Зарплата сотрудников больше или равнв " + salaryMax);
        int numb=0;
        for (int i =0; i<= employees.length- 1;i++){
            employees[i].setId(numb++);
            if (employees[i].getSalary() >= salaryMax ){
                System.out.println(employees[i]);
            }
        }
        System.out.println();
    }


       }


