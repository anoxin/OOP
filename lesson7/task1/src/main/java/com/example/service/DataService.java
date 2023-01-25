package com.example.service;

import java.util.List;

import com.example.model.Contractor;
import com.example.model.User;

public interface DataService<U extends User> {

    void addUser(U user);

    void save();

    void load();

    Contractor find();

    void remove();

    void addNewContact();

    void removeContact();

    List<U> getUsers();
}
