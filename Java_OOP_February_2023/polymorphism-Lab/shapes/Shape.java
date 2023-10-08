package shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public Shape(Double perimeter, Double area) {
        setPerimeter(perimeter);
        setArea(area);
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    void calculatePerimeter() {

    }


    void calculateArea() {

    }
}
