package com.example.ui;

import com.example.model.Contractor;
import com.example.service.DataService;

public class ContractorView extends UserView<Contractor> {

    public ContractorView(DataService<Contractor> model) {
        super(model);
    }
}
