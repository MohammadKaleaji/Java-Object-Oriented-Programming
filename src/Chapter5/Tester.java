package Chapter5;

public class Tester extends Person implements Someone{

    @Override
    public void display() {
        System.out.println("I am a software Tester");
    }

    @Override
    public void tellName() {
        System.out.println("Tester");
    }

}
