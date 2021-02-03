package Beispiel2_Figuren;

    class Circle extends Figure{

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {

        return 2 * radius*Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }


}
