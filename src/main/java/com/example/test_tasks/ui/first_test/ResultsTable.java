package com.example.test_tasks.ui.first_test;

import com.example.test_tasks.domain.SubstringDataBase;
import com.example.test_tasks.repository.SubstringDataBaseRepo;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("/substring/results")
public class ResultsTable extends VerticalLayout {

    private final SubstringDataBaseRepo substringDataBaseRepo;

    private final Grid<SubstringDataBase> results;

    private final Label label;

    private final Button mainPage;

    @Autowired
    public ResultsTable(SubstringDataBaseRepo substringDataBaseRepo){
        this.substringDataBaseRepo = substringDataBaseRepo;
        mainPage = new Button("Home");
        label = new Label("Results");
        results = new Grid<>(SubstringDataBase.class);
        results.setItems(substringDataBaseRepo.findAll());
        mainPage.addClickListener(e-> UI.getCurrent().navigate("/"));
        add(label, results, mainPage);
    }
}
