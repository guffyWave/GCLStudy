package com.example.gufran.myapplication.backend;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Load;

import java.util.HashSet;
import java.util.Set;

/**
 * The object model for the data we are sending through endpoints
 */
@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private Address address;
    private Set<String> tags;
    @Load
    private Ref<Parent> father;
    @Load
    private Ref<Parent> mother;

    public Student() {
        setTags(new HashSet<String>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Parent getFather() {
        return father.get();
    }

    public void setFather(Parent father) {
        this.father = Ref.create(father);
    }

    public Parent getMother() {
        return mother.get();
    }

    public void setMother(Parent mother) {
        this.mother = Ref.create(mother);
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }
}