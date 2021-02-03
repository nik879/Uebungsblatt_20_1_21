package Beispiel2_Figuren;

    class Rectangle extends Figure {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getPerimeter() {
        return 2 * length + 2 * width;
    }

    double getArea() {
        return length * width;
    }

}
