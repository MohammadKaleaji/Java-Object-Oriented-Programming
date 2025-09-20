package Chapter4;
// chaptr 4 - Polymorphism
public class Huyndai extends Car {

    public Huyndai(String model, int year, double km){
        super(model, year, km);
    }

    @Override
    public void setKm(double km){
        super.setKm(km + 40000);
    }

    void displayKm(){
        System.out.println("KM: " + super.getKm());
    }

    int displayKm(int km){
        return km + 40000;
    }

}
