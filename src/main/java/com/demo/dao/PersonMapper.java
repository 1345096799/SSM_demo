package com.demo.dao;

import com.demo.entity.Person;

import java.util.List;

public interface PersonMapper {
    int save(Person person);

    List<Person> queryAll();
}
