package com.educontrol.EduControl.views;

import com.educontrol.EduControl.model.Asignatura;
import com.educontrol.EduControl.repository.AsignaturaRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("/subjects/create")
public class SubjectCreateView extends VerticalLayout{
    public SubjectCreateView(AsignaturaRepository asignaturaRepository){
        AppLayoutView layout = new AppLayoutView();

        add(layout);

        Div container = new Div();
        container.addClassName("container");

        FormLayout formLayout = new FormLayout();
        formLayout.addClassName("form");

        // Campos del formulario
        TextField docenteField = new TextField("ID Docente");
        TextField horarioField = new TextField("ID Horario");
        TextField nombreField = new TextField("Nombre");

        // Agregar los campos al formulario
        formLayout.add(docenteField, horarioField, nombreField);

        // Botón de envío
         Button saveButton = new Button("Guardar", event -> {
            // Crear nueva instancia de Clase
            Asignatura asignatura = new Asignatura();
            asignatura.setIdDocente(Integer.parseInt(docenteField.getValue()));
            asignatura.setNombre(nombreField.getValue());
            asignatura.setIdHorario(Integer.parseInt(horarioField.getValue()));

            // Guardar la instancia en la base de datos
            asignaturaRepository.save(asignatura);

            Notification.show("Asignatura guardada con éxito");
        });

        container.add(
            new H1("Crear nueva asignatura"),
            formLayout,
            saveButton
        );

        add(container);
    }
}
