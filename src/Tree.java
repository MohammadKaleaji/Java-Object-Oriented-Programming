import java.awt.Color;
public class Tree {

    // define the variables 
    private double heightFt;
    private double trunkDiameterInches;
    TreeType treeType;
    protected static Color trunkColor = new Color(100, 100, 100);
    
    // define the constructor
    Tree(double heightFt, double trunkDiameterInches, TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    // define the getters
    public double getHeightFt() { 
        return heightFt;
    }
    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }
    
    public TreeType getTreeType() {
        return treeType;
    }

    // define the methods
    void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    void isTreeTall() {
        if (this.heightFt > 119) {
            System.out.println("This is a tall "+ this.treeType+ " Tree");
        }
    }

    static void announceTree() {
        System.out.println("Look at this "+trunkColor+ " Tree!");
    }

}

// static means the variable is shared by all instances of the class
// non-static means the variable is unique to each instance of the class