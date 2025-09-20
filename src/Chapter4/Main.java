package Chapter4;
// chaptr 4 - Polymorphism

public class Main {
    public static void main(String[] args) {
    Huyndai huyndai = new Huyndai("Elantra", 2024, 10000);
    System.out.println(huyndai.getModel() + " Year: " + huyndai.getYear());
    huyndai.setKm(20000);
    System.out.println(huyndai.getModel() + " KM: " +  huyndai.getKm());
    
    huyndai.displayKm(); 
    huyndai.displayKm(10000); // this is overloading the method

}
}

// Polymorphism is the ability of an object to take on many forms.
// 1- overriding a method in the sub class that is inherited from the super class
// 2- overloading a method in one class
