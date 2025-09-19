/* 
import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception {
        Tree myTree = new Tree(120, 12, TreeType.OAK);
        System.out.println(myTree.treeType);

        Tree myTree2 = new Tree(30, 90, TreeType.PINE);
        System.out.println(myTree2.treeType);

        myTree.isTreeTall(); // calling the method isTreeTall from the Tree class
        myTree2.isTreeTall();

        System.out.println(Tree.trunkColor);
        Tree.announceTree();

        // JAVA-built-in class
        Color defaultBlue = Color.BLUE;
        // defaultBlue.brighter();
        System.out.println(defaultBlue);
        // Access the variables of the Tree class using the getters
        System.out.println(myTree.getHeightFt());
        System.out.println(myTree.getTrunkDiameterInches());
        System.out.println(myTree.getTreeType());

        myTree.setTrunkDiameterInches(10); // it was 10 and now updating it using the setter
        System.out.println(myTree.getTrunkDiameterInches());

        String stringClassTest = "This is a test";
        boolean isEmptyResult = stringClassTest.isEmpty();
        System.out.println(isEmptyResult);

    }
}
*/