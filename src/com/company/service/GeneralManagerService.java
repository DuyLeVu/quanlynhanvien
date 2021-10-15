package com.company.service;

public interface GeneralManagerService<T> {
    void add (T t);

    void print();

    void find(int id);

    void update(T t, int id);

    void delete(int id);
}
