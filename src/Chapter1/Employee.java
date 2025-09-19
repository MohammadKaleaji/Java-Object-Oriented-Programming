package Chapter1;
//Chaptr 1
public class Employee {
    String name; 
    int age; 
    double salary;
    location location;

    Employee(String name, int age, double salary, location location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(){
        this.salary = this.salary * 1.2;
    }
    
}
