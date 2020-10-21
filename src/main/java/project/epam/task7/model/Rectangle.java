package project.epam.task7.model;

import project.epam.task7.data.IdGenerator;

public class Rectangle {
    int id;
    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;
    private Point pointFour;

    public Rectangle(Point pointOne, Point pointTwo, Point pointThree, Point pointFour) {

        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;
        this.pointFour = pointFour;
    }

    public int getId() {
        return id;
    }

    public Point getPointOne() {
        return pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public Point getPointThree() {
        return pointThree;
    }

    public Point getPointFour() {
        return pointFour;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    public void setPointThree(Point pointThree) {
        this.pointThree = pointThree;
    }

    public void setPointFour(Point pointFour) {
        this.pointFour = pointFour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (pointOne != null ? !pointOne.equals(rectangle.pointOne) : rectangle.pointOne != null){
            return false;
        }
        if (pointTwo != null ? !pointTwo.equals(rectangle.pointTwo) : rectangle.pointTwo != null){
            return false;
        }
        if (pointThree != null ? !pointThree.equals(rectangle.pointThree) : rectangle.pointThree != null){
            return false;
        }
        return pointFour != null ? pointFour.equals(rectangle.pointFour) : rectangle.pointFour == null;
    }

    @Override
    public int hashCode() {
        int result = pointOne != null ? pointOne.hashCode() : 0;
        result = 31 * result + (pointTwo != null ? pointTwo.hashCode() : 0);
        result = 31 * result + (pointThree != null ? pointThree.hashCode() : 0);
        result = 31 * result + (pointFour != null ? pointFour.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "pointOne=" + pointOne +
                ", pointTwo=" + pointTwo +
                ", pointThree=" + pointThree +
                ", pointFour=" + pointFour +
                '}';
    }
}
