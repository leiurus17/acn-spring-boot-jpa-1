package com.accenture.devcon;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;

@Route("component")
public class OpenSourceComponent extends VerticalLayout {
	
	public OpenSourceComponent() {
		DatePicker datePicker = new DatePicker("I'm a date picker");
		
		datePicker.addValueChangeListener(event -> {
			Notification.show(event.getValue().toString(), 5000, Position.MIDDLE);
		});
		
		MemoryBuffer memoryBuffer = new MemoryBuffer();
		
		add(datePicker);
	}

}
