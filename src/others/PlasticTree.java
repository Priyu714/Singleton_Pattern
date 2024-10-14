package others;

public class PlasticTree extends Tree{

    private double mass;
    private double height;

    public PlasticTree(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    @Override
    Tree copy() {
        return new PlasticTree(this.mass, this.height);
    }
}
