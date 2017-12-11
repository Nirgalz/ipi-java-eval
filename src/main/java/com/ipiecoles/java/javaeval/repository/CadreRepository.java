package com.ipiecoles.java.javaeval.repository;

import com.ipiecoles.java.javaeval.model.Employe;
import org.joda.time.LocalDate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class CadreRepository<T extends Employe> implements BaseEmployeRepository<T> {


    @Override
    public T findByMatricule(String matricule) {
        return null;
    }

    @Override
    public List<T> findByNomAndPrenom(String nom, String prenom) {
        return null;
    }

    @Override
    public List<T> findByNomOrPrenomAllIgnoreCase(String nomOuPrenom) {
        return null;
    }

    @Override
    public List<T> findByNomIgnoreCase(String nom) {
        return null;
    }

    @Override
    public Page<T> findByNomIgnoreCase(String nom, Pageable pageable) {
        return null;
    }

    @Override
    public List<T> findByDateEmbaucheBefore(LocalDate date) {
        return null;
    }

    @Override
    public List<T> findByDateEmbaucheAfter(LocalDate date) {
        return null;
    }

    @Override
    public List<T> findBySalaireGreaterThanOrderBySalaireDesc(Double salaire) {
        return null;
    }

    @Override
    public List<T> findEmployePlusRiches() {
        return null;
    }

    @Override
    public Iterable<T> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends T> S save(S s) {
        return null;
    }

    @Override
    public <S extends T> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public T findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<T> findAll() {
        return null;
    }

    @Override
    public Iterable<T> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void delete(Iterable<? extends T> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
