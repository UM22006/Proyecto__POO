package com.educontrol.EduControl.views;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.educontrol.EduControl.model.Clase;
import com.educontrol.EduControl.model.Horario;
import com.educontrol.EduControl.repository.HorarioRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("schedule/create")
public class HorarioCreateView extends VerticalLayout {
    
    public HorarioCreateView(HorarioRepository horarioRepository){
        AppLayoutView layout = new AppLayoutView();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        add(layout);

        Div container = new Div();
        container.addClassName("container");

        FormLayout formLayout = new FormLayout();
        formLayout.addClassName("form");

        // Campos del formulario
        TextField fechaField = new TextField("Día");
        TextField horaInicioField = new TextField("Hora inicio");
        TextField horaFinField = new TextField("Hora fin");

        // Agregar los campos al formulario
        formLayout.add(fechaField, horaInicioField, horaFinField);

        // Botón de envío
         Button saveButton = new Button("Guardar", event -> {
            // Crear nueva instancia de Clase
            Horario horario = new Horario();
            horario.setFecha(fechaField.getValue());
            horario.setHoraInicio(horaInicioField.getValue());
            horario.setHoraFinalizacion(horaFinField.getValue());

            // Guardar la instancia en la base de datos
            horarioRepository.save(horario);

            Notification.show("Horario guardado con éxito");
        });

        container.add(
            new H1("Crear nuevo horario"),
            formLayout,
            saveButton
        );

        add(container);
    }
}
