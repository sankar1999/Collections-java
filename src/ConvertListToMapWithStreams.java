import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMapWithStreams {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        Map<Integer, String> mapEmployee = new HashMap<Integer, String>();

        employees.add(new Employee(101, "Justin"));
        employees.add(new Employee(102, "Zayn"));
        employees.add(new Employee(103, "Drake"));

        mapEmployee = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println(mapEmployee);
    }
}
