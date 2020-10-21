package project.epam.task7.data.specification;

import project.epam.task7.logic.Calculator;
import project.epam.task7.model.Rectangle;

public class RectanglePerimeterSpecification implements Specification<Rectangle> {

    private  final double minPerimeter;
    private  final double maxPerimeter;
    private Calculator calculator;


    public RectanglePerimeterSpecification(double minPerimeter, double maxPerimeter, Calculator calculator) {
        this.minPerimeter = minPerimeter;
        this.maxPerimeter = maxPerimeter;
        this.calculator = calculator;
    }

    public RectanglePerimeterSpecification(double minPerimeter, double maxPerimeter) {
        this.minPerimeter = minPerimeter;
        this.maxPerimeter = maxPerimeter;
    }

    @Override
    public boolean specified(Rectangle rectangle) {
        Double area = calculator.calculatePerimeter(rectangle);
        return area.compareTo(minPerimeter) >= area.compareTo(maxPerimeter);
    }
}
