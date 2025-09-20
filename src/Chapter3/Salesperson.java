package Chapter3;
// chaptr 3 - Inheritance
public class Salesperson extends Employee{
    private double commissionPercentage;

    public Salesperson(String name, double totalSales, int age, double commissionPercentage){
        super(name, totalSales, age);
    }

    public double getCommissionPercentage(){
        return commissionPercentage;
    }
    public void raiseCommission(){
        if (this.commissionPercentage < 0.3){
            this.commissionPercentage = this.commissionPercentage * 1.2;
    }
}  
}
