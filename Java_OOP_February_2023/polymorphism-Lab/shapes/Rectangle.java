package shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double perimeter, Double area,Double height,Double width) {
        super(perimeter, area);
        setHeight(height);
        setWidth(width);

    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
