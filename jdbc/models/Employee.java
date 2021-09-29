package HW5.models;

public class Employee {
    private int id;
    private String name;
    private String lastName;
    private String personalCode;
    private String birthDate;
    protected String department;


    public Employee() {
    }

    public Employee(int id, String name, String lastName, String personalCode, String birthDate, String department) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.personalCode = personalCode;
        this.birthDate = birthDate;
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalCode='" + personalCode + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
