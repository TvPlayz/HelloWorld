package day33_encapsulation;

public class Employee {

	private String name ;
    private long id;
    private String jobTitle;
    private double salary;
    
    // default
    void work() {
    	System.out.println(name + " is a "+ jobTitle);
    	System.out.println(name + "is working 40 hours a week");
    }
    
    // read salary
    public double getSalary() {
        return salary;
    }
    
    // update salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // read id
    public long getId() {
        return id;
    }
    // update id
    public void setId(long id) {
        this.id = id;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    public Employee() {}
    
    
    public Employee(String name,String jobTitle, double salary, long id ) {
        setName(name);
//        this.name = name;
        setJobTitle(jobTitle);
        setSalary(salary);
        setId(id);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
    }
}
