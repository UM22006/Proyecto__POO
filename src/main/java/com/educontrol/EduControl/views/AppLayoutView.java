package com.educontrol.EduControl.views;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class AppLayoutView extends VerticalLayout {
    
    public AppLayoutView(){

        Div header = new Div();
        header.addClassName("header");
        
        Nav nav = new Nav();
        nav.add(
            new Anchor("admin", "Administrador"),
            new Anchor("docente", "Docente")
        );
        Anchor title = new Anchor("/", "EduControl");
        title.addClassName("title");

        Div container = new Div();
        container.addClassName("container");

        container.add(title, nav);
        header.add(container);

        add(header);
    }
}
