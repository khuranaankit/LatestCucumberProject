import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Employee {

String employeeName,employeeAddress,employeeContact;
int employeeId;

Employee(int id, String name, String address, String contact){
    employeeId = id;
    employeeName = name;
    employeeAddress = address;
    employeeContact=contact;
}
public String getAddress(){
    return this.employeeAddress;
}
public String getName(){
    return this.employeeName;
}
public int getEmployeeId(){
    return this.employeeId;
}
public String getEmployeeContact(){
    return this.employeeContact;
}
        }

public class CompareColumnWithComparator implements Comparator<Employee> {

    public int sortEmployeeByName(String a1, String a2) {

        return a1.compareTo(a2);
    }

    @Override

    public int compare(Employee e1, Employee e2) {
        String eName1 = e1.employeeName;
        String eName2 = e2.employeeName;
        return sortEmployeeByName(eName1, eName2);
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(56879, "Gopal", "Vishnu Garden", "9319570557");
        Employee emp2 = new Employee(59069, "Khyat", "Paschim Vihar", "9910827087");
        Employee emp3 = new Employee(60837, "Ankit", "Dwarka", "9312269335");
        ArrayList<Employee> al = new ArrayList();
        al.add(emp1);
        al.add(emp2);
        al.add(emp3);
//        al.sort(new CompareColumnWithComparator());
        al.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorted By Name");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).employeeId + "," + al.get(i).employeeName+","+al.get(i).employeeAddress + "," + al.get(i).employeeContact);
        }

        System.out.println("Sorted By Address");
        al.sort(Comparator.comparing(Employee::getAddress));
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).employeeId + "," + al.get(i).employeeName+","+al.get(i).employeeAddress + "," + al.get(i).employeeContact);
        }

        System.out.println("Sorted By Employee Id");
        al.sort(Comparator.comparing(Employee::getEmployeeId));
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).employeeId + "," + al.get(i).employeeName+","+al.get(i).employeeAddress + "," + al.get(i).employeeContact);
        }

        System.out.println("Sorted By Employee Contact");
        al.sort(Comparator.comparing(Employee::getEmployeeContact));
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).employeeId + "," + al.get(i).employeeName+","+al.get(i).employeeAddress + "," + al.get(i).employeeContact);
        }
    }
}
