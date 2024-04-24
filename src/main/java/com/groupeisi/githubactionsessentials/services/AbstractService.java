package com.groupeisi.githubactionsessentials.services;

import java.util.List;

public interface AbstractService<T> {
    void save(T t);
    T findById(Long id);
    List<T> findAll();
    void delete(Long id);
    T update(Long id, T t);
}
