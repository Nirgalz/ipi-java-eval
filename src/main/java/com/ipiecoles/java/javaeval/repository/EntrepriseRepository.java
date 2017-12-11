package com.ipiecoles.java.javaeval.repository;

import com.ipiecoles.java.javaeval.model.Entreprise;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EntrepriseRepository<T extends Entreprise> extends PagingAndSortingRepository<T, Long>
{
    @Override
    default Iterable<T> findAll(Sort sort) {
        return null;
    }

    @Override
    default Page<T> findAll(Pageable pageable) {
        return null;
    }

    @Override
    default <S extends T> S save(S s) {
        return null;
    }

    @Override
    default <S extends T> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    default T findOne(Long aLong) {
        return null;
    }

    @Override
    default boolean exists(Long aLong) {
        return false;
    }

    @Override
    default Iterable<T> findAll() {
        return null;
    }

    @Override
    default Iterable<T> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void delete(Long aLong) {

    }

    @Override
    default void delete(T t) {

    }

    @Override
    default void delete(Iterable<? extends T> iterable) {

    }

    @Override
    default void deleteAll() {

    }
}
