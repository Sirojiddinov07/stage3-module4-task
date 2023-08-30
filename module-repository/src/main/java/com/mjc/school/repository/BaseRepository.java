package com.mjc.school.repository;

import com.mjc.school.repository.model.BaseEntity;
import com.mjc.school.repository.model.News;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T extends BaseEntity<K>, K> {

    List<K> readAll(int page, int limit, String sortBy);

    Optional<T> readById(K id);

    T create(T entity);

    T update(T entity);

    boolean deleteById(K id);

    boolean existById(K id);
}
