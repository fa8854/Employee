import java.util.Scanner;
public class Main {
    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        addEmployee();
        sumMouthSalary();
        minSalary();
        maxSalary();
        salaryMiddle();
        eployeefio();
        }
   public static void addEmployee(){
       System.out.println("Список сотрудников");
       for (int i=0; i <= employee.length -1 ;i++){
           employee[0] = new Employee("Фили Моррис Иванович", 1,2000);
            employee[1] = new Employee("Александрова Татьяна Александровна", 2,2000);
            employee[2] = new Employee("Крытов Александр", 2,2000);
            employee[3] = new Employee("Иванов Иван", 3,2000);
            employee[4] = new Employee("Максим Самарцев", 4,100);
            employee[5] = new Employee("Алексей Веселов", 5,51500);
            employee[6] = new Employee("Александр Сидоренков", 4,30000.500);
            employee[7] = new Employee("Максим Глушаков", 2,12000);
            employee[8] = new Employee("Данил Оводов", 1,2000);
            employee[9] = new Employee("Корытко Александр", 2,34000);
            System.out.println(employee[i]);
                        }
       System.out.println();
   }
       public static void sumMouthSalary(){
       double sum = 0;
        for (int i =0; i<= employee.length - 1;i++){
            sum =sum + employee[i].getSalary();
        }
           System.out.println("Сумма затрат на зарплату в месяц : " + sum);
           System.out.println();
       }
       public static void minSalary(){
        double min=900000;
        for (int i = 0; i <= employee.length-1; i++){
            if(employee[i].getSalary() < min) {
                min =employee[i].getSalary();
            }
        }
           System.out.println("Минимальная зарплата : " + min);
           System.out.println();
       }
       public static void maxSalary(){
           double max = 0;
           for (int i = 0; i <= employee.length - 1; i++){
               if(employee[i].getSalary() > max) {
                   max =employee[i].getSalary();
               }
           }
           System.out.println("Максимальная зарплата " + max);
           System.out.println();
       }
    public static void salaryMiddle(){
        double sum = 0;
        double middle = 0;
        for (int i =0; i<= employee.length - 1;i++){
            sum =sum + employee[i].getSalary();
        }
        middle = sum / employee.length;
        System.out.println("Средняя зарплата : " + middle);
        System.out.println();
    }
    public static void eployeefio(){
           System.out.println("Список Ф.И.О. сотрудников");
           for (int i = 0 ; i<= employee.length - 1; i ++){
            System.out.println(employee[i].getFio());
        }
           System.out.println();
       }
       }


