package com.educontrol.EduControl.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("docente")
public class HomeDocenteView extends VerticalLayout {
    
    public HomeDocenteView(){
        AppLayoutView layout = new AppLayoutView();

        add(layout);

        Div container = new Div();
        container.addClassName("container");

        container.add(
            new H1("Vista de docente")
        );

        add(container);
    }
}
