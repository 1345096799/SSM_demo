package com.demo.service;

import com.demo.entity.Person;

import java.util.List;

public interface PersonService {
    int save(Person person);

    List<Person> queryAll();
}
