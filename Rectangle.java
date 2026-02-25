public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(){
        this.width = 1.0; 
        this.height = 1.0;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.height;
    }    

    public void setLength(double height){
        this.height = height;
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return (height * 2) + (width * 2);
    }

    @Override
    public String toString(){
        return "Rectangle: width = " + this.width + " height = " + this.height;
    }

}
