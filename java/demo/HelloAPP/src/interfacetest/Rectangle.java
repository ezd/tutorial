package interfacetest;

public class Rectangle implements Shap, ClassPrityPrintor {
    private double length;
    private double width;

    public Rectangle(double l, double w){
        this.length= l;
        this.width= w;
    }

    @Override
    public double area() {
        return this.width * this.length;
    }

    @Override
    public String prityPrint() {
        return "Rectangle information:{Length is:"+this.length+", Width is:"+this.width+"}";
    }
}
