package com.educontrol.EduControl.views;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("admin")
public class HomeAdminView extends VerticalLayout {
    
    public HomeAdminView(){
        AppLayoutView layout = new AppLayoutView();

        add(layout);

        Div container = new Div();
        container.addClassName("container");
        
        Div grid = new Div();
        grid.addClassName("grid");

        Anchor subjectLink = new Anchor("/subjects/create", "Agregar asignatura");
        Anchor classLink = new Anchor("/class/create", "Agregar clase");
        Anchor teacherLink = new Anchor("/teacher/create", "Agregar docente");
        Anchor TeacherSubjectsLink = new Anchor("/teachersubjects/create", "Agregar docente a materia");
        Anchor scheduleLink = new Anchor("/schedule/create", "Agregar horario");
        Anchor historyStudenLink = new Anchor("/historystuden/create", "Agregar registro académico");

        grid.add(subjectLink);
        grid.add(classLink);
        grid.add(teacherLink);
        grid.add(TeacherSubjectsLink);
        grid.add(scheduleLink);
        grid.add(historyStudenLink);

        container.add(
            new H1("Administra elementos"),
            grid
        );


        add(container);
    }
}
