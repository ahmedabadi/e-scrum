package tests.appointment;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Doctor;
import services.appointementServices.interfaces.AppointmentServicesRemote;

public class TestAddDoctor {

	public static void main(String[] args) throws NamingException {

		Context context = new InitialContext();
		AppointmentServicesRemote proxy = (AppointmentServicesRemote) context
				.lookup("/e-scrum/AppointmentServices!services.appointementServices.interfaces.AppointmentServicesRemote");
		
		Doctor doctor=new Doctor();
		
		System.out.println(proxy.addDoctor(doctor));
	}
}
