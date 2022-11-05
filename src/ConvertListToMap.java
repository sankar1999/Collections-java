import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertListToMap {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        Map<Integer, Employee> mapEmployee = new HashMap<Integer, Employee>();

        employees.add(new Employee(101, "Justin"));
        employees.add(new Employee(102, "Zayn"));
        employees.add(new Employee(103, "Drake"));

        System.out.println(employees);

        for(Employee employee : employees) {
            mapEmployee.put(employee.getId(), employee);
        }

        System.out.println(mapEmployee);
    }
}
