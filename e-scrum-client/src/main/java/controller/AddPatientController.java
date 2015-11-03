package controller;

import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.appointementServices.interfaces.AppointmentServicesRemote;
import entities.Patient;

public class AddPatientController extends AnchorPane {

	@FXML
	private TextField name;
	@FXML
	private TextField cinNumber;
	@FXML
	private DatePicker birthDate;
	@FXML
	private TextArea address;
	@FXML
	private Button btnAdd;
	@FXML
	private TextField phoneNumber;

	Context context = null;

	@FXML
	private void initialize() throws NamingException {
		
		context = new InitialContext();
		AppointmentServicesRemote proxy = (AppointmentServicesRemote) context
				.lookup("/e-scrum/AppointmentServices!services.appointementServices.interfaces.AppointmentServicesRemote");
		
		Patient patient = new Patient(name.getText(), Integer.valueOf(cinNumber
				.getText()), new Date(), address.getText(),
				Integer.valueOf(phoneNumber.getText()));
		

		btnAdd.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {

					proxy.addPatient(patient);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

	}

}
