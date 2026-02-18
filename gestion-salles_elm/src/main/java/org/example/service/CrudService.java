package org.example.service;
// org n'est pas com 0637
import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {
    T save(T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
    void update(T entity);
    void delete(T entity);
    void deleteById(ID id);
}

// Créer une interface générique pour les opérations CRUD 0637