package project.epam.task7.model;

public class Parameters {
    private double area;
    private double perimeter;

    public Parameters(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Parameters that = (Parameters) o;

        if (Double.compare(that.area, area) != 0){
            return false;
        }
        return Double.compare(that.perimeter, perimeter) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(area);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perimeter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
