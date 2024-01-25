import com.engeto.ja.computers.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 =
                new Employee("Karel Dvořák",
                LocalDate.of( 1998, 1, 13),
                BigDecimal.ZERO, 321);
            // vytvoření objektu
        Employee employee2 = new Employee("Jana Malá",
                LocalDate.of(2005, 12, 8));
        Employee employee3 = new Employee("Lukáš Čermák",
                LocalDate.of(1989, 11, 8));

        // seznamy
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        System.out.println(" Počet zaměstnanců: " + employeeList.size());
        for (int i = 1; i <= 10; i++){
            employeeList.add(new Employee( "Zaměstnanec" ,+i, LocalDate.of(1990,1, i)));
        }
        System.out.println("Počet zaměstnanců: " + employeeList.size());
        System.out.println("Jméno prvního zaměstnance: " + employeeList.get(0).getName());
        System.out.println("Jméno druhého zaměstnance: " + employeeList.get(1).getName());


        for (Employee: employeeList){
            System.out.println(employee.getName() + "Sídlí v kanceláři " + employee.getOfficeNo());

        }
        employeeList.clear();
        System.out.println("Počet zaměstnanců: " + employeeList.size());

        // Takto NE (porušuje zapouzdření)
        //   employee1.name = "Karel";

        employee1.setName("Karel"); // volám metodu
        System.out.println(employee1.getName());
        // když dám ve třídě Employee private, tak mi getName nepojede
        // protože to nebude dostupné pro tuto třídu

        employee1.setAccountState(BigDecimal.valueOf(2));
        System.out.println(
            employee1.canBuy(BigDecimal.valueOf(2), 5));



    }
}