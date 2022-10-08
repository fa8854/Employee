public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {
        addEmployee();
        sumMouthSalary();
        minSalary();
        maxSalary();
        salaryMiddle();
        eployeefio();
        indexSalary(0.1);
        departmetsSum(2);
        departmetsMin(1);
        departmetsMax(2);
        departmetsMiddleSalary(2);
        departmentsIndexSelary(0.7,1);
        departments(2);
        salaryMin(2000);
        salaryMax(35000);
    }
    private static void addEmployee(){
       System.out.println("Список сотрудников");
        EMPLOYEES[0] = new Employee("Фили Моррис Иванович", 1,1000);
        EMPLOYEES[1] = new Employee("Александрова Татьяна Александровна", 1,2000);
        EMPLOYEES[2] = new Employee("Крытов Александр", 1,2400);
        EMPLOYEES[3] = new Employee("Иванов Иван", 3,5000);
        EMPLOYEES[4] = new Employee("Максим Самарцев", 4,100);
        EMPLOYEES[5] = new Employee("Алексей Веселов", 5,51500);
        EMPLOYEES[6] = new Employee("Александр Сидоренков", 4,30000.500);
        EMPLOYEES[7] = new Employee("Максим Глушаков", 2,12000);
        EMPLOYEES[8] = new Employee("Данил Оводов", 1,2000);
        EMPLOYEES[9] = new Employee("Корытко Александр", 2,34000);
            printEmployee();
       System.out.println();
   }
    private static void printEmployee(){
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
   }
    private static void sumMouthSalary(){
        double sum = 0;
        for (int i =0; i<= EMPLOYEES.length - 1;i++){
           sum =sum + EMPLOYEES[i].getSalary();
        }
           System.out.println("Сумма затрат на зарплату в месяц : " + sum);
           System.out.println();
       }
    private static void minSalary(){
        double min=Integer.MAX_VALUE;
        for (int i = 0; i <= EMPLOYEES.length-1; i++){
            if(EMPLOYEES[i].getSalary() < min) {
                min =EMPLOYEES[i].getSalary();
            }
        }
           System.out.println("Минимальная зарплата : " + min);
           System.out.println();
       }
    private static void maxSalary(){
           double max = 0;
           for (int i = 0; i <= EMPLOYEES.length - 1; i++){
               if(EMPLOYEES[i].getSalary() > max) {
                   max =EMPLOYEES[i].getSalary();
               }
           }
           System.out.println("Максимальная зарплата " + max);
           System.out.println();
       }
    private static void salaryMiddle(){
        double sum = 0;
        double middle;
        for (int i =0; i<= EMPLOYEES.length - 1;i++){
            sum =sum + EMPLOYEES[i].getSalary();
        }
        middle = sum / EMPLOYEES.length;
        System.out.println("Средняя зарплата : " + middle);
        System.out.println();
    }
    private static void eployeefio(){
           System.out.println("Список Ф.И.О. сотрудников");
           for (int i = 0 ; i<= EMPLOYEES.length - 1; i ++){
            System.out.println(EMPLOYEES[i].getFio());
        }
           System.out.println();
       }
    private static void indexSalary(double index){
        System.out.println("Индексация зарплат сотрудников");
           for (int i =0; i<= EMPLOYEES.length - 1;i++){
               EMPLOYEES[i].setSalary(EMPLOYEES[i].getSalary() + EMPLOYEES[i].getSalary()* index);
               System.out.println("Зарплата увеличена " + EMPLOYEES[i].getFio() + " " + EMPLOYEES[i].getSalary() );
           }
           System.out.println();

       }
    private static void departments(int dep){
           System.out.println("Сотрудники по отделам");
        for (int i =0; i<= EMPLOYEES.length- 1;i++){
             if (EMPLOYEES[i].getDepartment() == dep){
                 System.out.println(EMPLOYEES[i].getFio()+ " " + EMPLOYEES[i].getSalary());
                       }
                   }System.out.println();
       }
    private static void departmetsMin(int dep){
           double min = Integer.MAX_VALUE;
           for (int i =0; i<= EMPLOYEES.length- 1;i++ ){
                if (EMPLOYEES[i].getDepartment() == dep && EMPLOYEES[i].getSalary() < min){
                    min = EMPLOYEES[i].getSalary();
                }
       }
           System.out.println("Минимальная зарплата по отделу "+ min);
           System.out.println();
    }
    private static void departmetsMax(int dep){
        double max = 0;
        for (int i =0; i<= EMPLOYEES.length- 1;i++){
            if (EMPLOYEES[i].getDepartment() == dep && EMPLOYEES[i].getSalary() > max){
                max = EMPLOYEES[i].getSalary();
                }
        }
        System.out.println("Максимальная зарплата по отделу "+ max);
        System.out.println();
    }
    private static void departmetsSum(int dep){
        double sum = 0;
        for (int i =0; i<= EMPLOYEES.length- 1;i++){
            if (EMPLOYEES[i].getDepartment() == dep){
                sum =sum + EMPLOYEES[i].getSalary();
                }
        }
        System.out.println("Сумма зарплаты по отделу " + sum);
        System.out.println();
    }
    private static void departmetsMiddleSalary (int dep){
        double middle =0;
        int department = 0;
        double sum = 0;
        for (int i =0; i<= EMPLOYEES.length- 1;i++){
            if (EMPLOYEES[i].getDepartment() == dep){
                System.out.println(EMPLOYEES[i]);
                department = department + 1;
                sum =sum + EMPLOYEES[i].getSalary();
            }
        }
        middle = sum / department;
        System.out.println("Средняя зарплата по отделу : " + middle);
        System.out.println();
    }

    private static void departmentsIndexSelary(double index, int dep){
        System.out.println("Зарплата сотрудникам проиндексирована");
        for (int i =0; i<= EMPLOYEES.length- 1;i++){
            if (EMPLOYEES[i].getDepartment() == dep){
                System.out.println(EMPLOYEES[i]);
                EMPLOYEES[i].setSalary(EMPLOYEES[i].getSalary() + EMPLOYEES[i].getSalary()* index);
                System.out.println("Зарплата увеличена " + EMPLOYEES[i].getFio() + " " + EMPLOYEES[i].getSalary() );
            }
        }
       System.out.println();
    }
    private static void salaryMin(double salaryMin){
        System.out.println("Зарплата сотрудников меньше или равнв " + salaryMin);
        for (int i =0; i<= EMPLOYEES.length- 1;i++){
            if (EMPLOYEES[i].getSalary() <= salaryMin ){
                System.out.println(EMPLOYEES[i]);
            }
        }
        System.out.println();
    }
    private static void salaryMax(double salaryMax){
        System.out.println("Зарплата сотрудников больше или равнв " + salaryMax);
        for (int i =0; i<= EMPLOYEES.length- 1;i++){
            if (EMPLOYEES[i].getSalary() >= salaryMax ){
                System.out.println(EMPLOYEES[i]);
            }
        }
        System.out.println();
    }
}


