package ru.practicum.explore.with.me.category.exception;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(Long id) {
        super("Category " + id + " not found");
    }
}
