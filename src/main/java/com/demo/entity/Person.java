package com.demo.entity;

/**
 * @PACKAGE_NAME: com.demo.entity
 * @DATE: 2021/11/27
 * @PROJECT_NAME: SSM_demo
 * @AUTHOR: ding.bk
 * @Description:
 **/


public class Person {

    private Long id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
