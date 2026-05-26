package inheritance;

public class Employee  extends Person {

    private String employeeId;
    private String title;

    public Employee() {
        System.out.println("in Employee default constructor");
    }

    public Employee(String name) {
         super(name);
        // El súper lo utilizamos para decidir que constructor usamos
        // si le metemos name al constructor este nos manda al segundo
        // que hemos definido con el nombre de la persona.
        // Si usamos el súper solo, por defecto usa el default.
        System.out.println("in Employee constructor " + name);
        setName(name);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
