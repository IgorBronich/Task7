package project.epam.task7.model;

public interface Observer<T> {

    void update(T observable);

}
