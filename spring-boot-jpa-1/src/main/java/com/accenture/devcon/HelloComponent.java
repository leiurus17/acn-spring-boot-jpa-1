package com.accenture.devcon;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
//Div
public class HelloComponent extends VerticalLayout {
	
	public HelloComponent() {
		Div message = new Div();
		Button click = new Button("Click to greet");
		click.addThemeVariants(ButtonVariant.LUMO_LARGE, ButtonVariant.LUMO_PRIMARY);
		
		click.addClickListener(event -> {
			message.setText("Hello DEVCON - JAVA FY19!");
		});
		
		add(click,message);
	}
}
