package Chapter4;
// chaptr 4 - Polymorphism
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.UnaryOperator;

public class OddArrayList extends ArrayList<Integer> {
    // override the add method to add only odd numbers

    // add the element at the given index
    @Override
    public void add(int index, Integer element){
        if (isOdd(element)){
            super.add(index, element);
        }
    }

    // add the element to the end of the list
    @Override
    public boolean add(Integer element){
        if (isOdd(element)){
            return super.add(element);
        }
        return false;
    }

    // add all the elements to the end of the list
    @Override
    public boolean addAll(Collection<? extends Integer> c){
        for (Integer element : c){
            if (isOdd(element)){
                super.add(element);
            }
        }
        return true;
    }

    // add all the elements to the given index
    @Override
    public boolean addAll(int index, Collection<? extends Integer> c){
        for (Integer element : c){
            if (isOdd(element)){
                super.add(index, element);
            }
        }
        return true;
    }
    
    // replace all the elements with the given operator
    @Override
    public void replaceAll(UnaryOperator<Integer> operator){
        super.replaceAll(operator);
        super.removeIf(n -> !isOdd(n));
    }

    // check if the number is odd
    public static boolean isOdd(int number){
        return Math.abs(number) %2 == 1;
    }
}
