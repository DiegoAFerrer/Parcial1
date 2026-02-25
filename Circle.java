public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
        this.radius = 1.0; 
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }

    public double getDiameter(){
        return this.radius * 2;
    }

    @Override
    public String toString(){
        return "Circle: radius = " + this.radius;
    }

}
