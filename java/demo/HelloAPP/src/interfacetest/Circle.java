package interfacetest;

public class Circle implements Shap, ClassPrityPrintor{
    final double pi=3.14;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return this.radius * this.pi;
    }

    @Override
    public String prityPrint() {
        return "Hi I am circle my radius is:"+this.radius;
    }
}
