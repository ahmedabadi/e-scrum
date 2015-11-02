package controller;

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

	Context context = null;

	@FXML
	private void initialize() throws NamingException {

		Patient patient = new Patient();
		patient.setName(name.getText());
		patient.setCinNumber(12345678);
		patient.setPhoneNumber(122233366);
		// patient.setDateBirth(Date.valueOf(birthDate.getValue()));
		patient.setAddress(address.getText());

		btnAdd.setOnAction((event) -> {
			try {
				context  = new InitialContext();
				AppointmentServicesRemote proxy = (AppointmentServicesRemote) context
						.lookup("/e-scrum/AppointmentServices!services.appointementServices.interfaces.AppointmentServicesRemote");

				proxy.addPatient(patient);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

	}

}
