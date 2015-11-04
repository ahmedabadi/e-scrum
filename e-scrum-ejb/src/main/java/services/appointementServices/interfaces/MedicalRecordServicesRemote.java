package services.appointementServices.interfaces;

import javax.ejb.Remote;

import entities.MedicalRecord;
import entities.Patient;

@Remote
public interface MedicalRecordServicesRemote {

	Boolean createMedicalRecord(MedicalRecord medicalRecord);

	Boolean assignMedicalRecordPatient(MedicalRecord medicalRecord,
			Patient patint);

	MedicalRecord findMedicalRecordByIdPatient(Integer idPatient);
}
