package project.epam.task7.data.specification;

import project.epam.task7.model.Rectangle;

public class RectangleIdSpecification implements Specification<Rectangle> {
    private final int id;

    public RectangleIdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specified(Rectangle rectangle) {
        return rectangle.getId() == id;
    }
}
