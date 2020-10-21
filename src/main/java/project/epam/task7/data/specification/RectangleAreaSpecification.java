package project.epam.task7.data.specification;

import project.epam.task7.logic.Calculator;
import project.epam.task7.model.Rectangle;

public class RectangleAreaSpecification implements Specification<Rectangle>{
    private  final double minArea;
    private  final double maxArea;
    private Calculator calculator;


    RectangleAreaSpecification(double minArea, double maxArea, Calculator calculator) {
        this.minArea = minArea;
        this.maxArea = maxArea;
        this.calculator = calculator;
    }

    public RectangleAreaSpecification(double minArea, double maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }

    @Override
    public boolean specified(Rectangle rectangle){
        Double area = calculator.calculateArea(rectangle);
        return area.compareTo(minArea) >= area.compareTo(maxArea);
    }
}
