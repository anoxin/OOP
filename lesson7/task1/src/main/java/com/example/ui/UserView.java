package com.example.ui;

import com.example.model.User;
import com.example.service.DataService;

public abstract class UserView<U extends User> {
    private DataService<U> model;

    public UserView(DataService<U> model) {
        this.model = model;
    }

    public void showUsers() {
        for (U user : model.getUsers()) {
            System.out.println(user);
        }
        System.out.println("\n");
    }
}
