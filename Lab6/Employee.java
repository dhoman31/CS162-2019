public class Employee{

    private String name;
    private String jobTitle;
    private float salary;
    private static int lastEmployeeID = 0;
    private int employeeID;
    
    public Employee(){
        this.name = "John Doe";
        this.jobTitle = "Software Engineer";
        this.salary = 19000f;
        lastEmployeeID++;
        this.employeeID = lastEmployeeID;
    }

    public Employee(String name, String jobTitle, float salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        lastEmployeeID++;
        this.employeeID = lastEmployeeID;
    }

    public String getName(){
        return name;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public float getSalary(){
        return salary;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public void showEmp(){
        System.out.println("NAME: " + this.name + "\nTITLE: " + this.jobTitle + "\nCURRENT SALARY: " + this.salary + "\nEMPLOYEE ID: " + this.employeeID);
    }

    public String toString(){
        return "NAME: " + this.name + "\nTITLE: " + this.jobTitle + "\nCURRENT SALARY: " + this.salary + "\nEMPLOYEE ID: " + this.employeeID;
    }

}