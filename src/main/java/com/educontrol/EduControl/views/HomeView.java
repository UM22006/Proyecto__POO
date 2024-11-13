package com.educontrol.EduControl.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {

        AppLayoutView layout = new AppLayoutView();

        add(layout);

        Div container = new Div();
        container.addClassName("container");

        container.add(
            new H1("Bienvenidos a EduControl"),
            new Paragraph("Sistema de administración de calificaciones"),
            new Paragraph("Aquí podrás gestionar las calificaciones de tus alumnos o agregar más información al sistema, dependiendo de tu rol...")
        );

        add(container);
    }
}