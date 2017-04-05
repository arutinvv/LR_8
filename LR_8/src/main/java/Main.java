/**
 * Created by VARUTIN on 4/5/2017.
 */
public class Main {


    public static void main(String[] args) {


        MyCompany myCompany = new MyCompany();
        myCompany.addEmployee("Serj", 25, "Hillel");
        myCompany.addEmployee("Alex", 30, "Hillel");
        myCompany.addEmployee("Serj", 33, "Hillel");

        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName());
        }

        myCompany.deleteEmployeeByName("Serj");

        System.out.println();
        System.out.println("After deleted Serj");

        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName());
        }

        System.out.println(myCompany.getEmployeeByName("Test Name").getName());

    }
}
