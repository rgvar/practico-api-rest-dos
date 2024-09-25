package com.example.inicial1.services;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll() throws Exception;
    T findById(Long id) throws Exception;
    T save(T entity) throws Exception;
    T update(Long id, T entity) throws Exception;
    boolean delete(Long id) throws Exception;
}
