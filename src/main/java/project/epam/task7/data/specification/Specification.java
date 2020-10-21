package project.epam.task7.data.specification;

import project.epam.task7.model.Rectangle;

public interface Specification<T> {
    boolean specified(T object);
}
