package com.demo.service.impl;

import com.demo.dao.PersonMapper;
import com.demo.entity.Person;
import com.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PACKAGE_NAME: com.demo.service.impl
 * @DATE: 2021/11/27
 * @PROJECT_NAME: SSM_demo
 * @AUTHOR: ding.bk
 * @Description:
 **/

@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public int save(Person person) {
        return personMapper.save(person);
    }

    @Override
    public List<Person> queryAll() {
        return personMapper.queryAll();
    }
}
