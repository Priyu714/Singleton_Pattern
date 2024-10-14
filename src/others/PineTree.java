package others;

public class PineTree extends Tree{
    public PineTree(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    private double mass;
    private double height;


    @Override
    Tree copy() {
        return new PineTree(this.mass,this.height);
    }
}
