package services.appointementServices.interfaces;

import javax.ejb.Remote;

import entities.MedicalRecord;

@Remote
public interface MedicalRecordServicesRemote {

	Boolean createMedicalRecord(MedicalRecord medicalRecord);

	Boolean assignMedicalRecordPatient(MedicalRecord medicalRecord,
			Integer idPatint);

	MedicalRecord findMedicalRecordByIdPatient(Integer idPatient);
}
