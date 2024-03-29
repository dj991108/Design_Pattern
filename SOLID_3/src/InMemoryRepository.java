import java.util.HashMap;
// srp ocp!
public class InMemoryRepository {
    private static InMemoryRepository instance;
    private HashMap<String, Employee> map;
    private InMemoryRepository() {
        map = new HashMap<>();
    }
    public static InMemoryRepository getInstance() {
        if (instance == null)
            instance = new InMemoryRepository();
        return instance;
    }
    //inMemory
    public void createEmployee(String id) {
        if(!map.containsKey(id))	//키가 들어있는지 확인 후, 있으면 덮어쓰지 않는다.
            map.put(id, new Employee(id));
    }

    public Employee getEmployee(String id) {
       // if (!map.containsKey(id)) throw new EmpoyeeNotFoundException();
        return copyEmployee(map.get(id));
      }

    private Employee copyEmployee(Employee emp) {
        return new Employee(
                emp.getId(), emp.getWorkingHours(), emp.getOvertimeHours()
        );
    }

    public Employee writeEmployee(Employee emp) {
        map.put(emp.getId(), emp);
        return map.get(emp.getId());
    }

    public void printEmployees() {
        map.forEach((key, emp) -> {
            System.out.println(
                    String.format("키값 -> %s, 정상 근무시간 -> %s, 초과 근무시간 -> %s",
                            key, emp.getWorkingHours(), emp.getOvertimeHours())
            );
        });
    }

//    public void updateWorkingHours(String id, int hours) {
//
//        Optional<Employee> emp = getEmployee(id);
//        emp.ifPresent(e ->
//                e.setWorkingHours(e.getWorkingHours() + hours));
//    }
//
//    public void updateOvertimeHours(String id, int hours) {
//        Optional<Employee> emp = getEmployee(id);
//        emp.ifPresent(e ->
//                e.setOvertimeHours(e.getOvertimeHours() + hours));
//    }
}
