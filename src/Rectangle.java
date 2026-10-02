public class Rectangle implements Sortable {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean isGreaterThan(Sortable other) {
        Rectangle otherRectangle = (Rectangle) other;

        return this.getArea() > otherRectangle.getArea();
    }
}
