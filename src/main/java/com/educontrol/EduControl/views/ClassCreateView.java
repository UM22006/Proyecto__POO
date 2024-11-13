package com.educontrol.EduControl.views;

import com.educontrol.EduControl.model.Clase;
import com.educontrol.EduControl.repository.ClaseRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("class/create")
public class ClassCreateView extends VerticalLayout {
    
    public ClassCreateView(ClaseRepository claseRepository) {

        AppLayoutView layout = new AppLayoutView();

        add(layout);

        Div container = new Div();
        container.addClassName("container");

        FormLayout formLayout = new FormLayout();
        formLayout.addClassName("form");

        // Campos del formulario
        TextField estadoField = new TextField("Estado");
        TextField idAsignaturaField = new TextField("ID Asignatura");
        TextField idDocenteField = new TextField("ID Docente");
        TextField idHorarioField = new TextField("ID Horario");

        // Agregar los campos al formulario
        formLayout.add(estadoField, idAsignaturaField, idDocenteField, idHorarioField);

        // Botón de envío
         Button saveButton = new Button("Guardar", event -> {
            // Crear nueva instancia de Clase
            Clase clase = new Clase();
            clase.setEstado(Integer.parseInt(estadoField.getValue()));
            clase.setIdAsignatura(Integer.parseInt(idAsignaturaField.getValue()));
            clase.setIdDocente(Integer.parseInt(idDocenteField.getValue()));
            clase.setIdHorario(Integer.parseInt(idHorarioField.getValue()));

            // Guardar la instancia en la base de datos
            claseRepository.save(clase);

            Notification.show("Clase guardada con éxito");
        });

        container.add(
            new H1("Bienvenidos a EduControl"),
            formLayout,
            saveButton
        );

        add(container);
    }
}
