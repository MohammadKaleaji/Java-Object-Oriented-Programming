package Chapter4;
// chaptr 4 - Polymorphism
public class Car {
    private String model;
    private int year;
    private double km;

    public Car(String model, int year, double km){
        this.model = model;
        this.year = year;
        this.km = km;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){       
        return year;
    }
    public double getKm(){
        return km;
    }
    
    public void setKm(double km){
        this.km = km;
    }

}
