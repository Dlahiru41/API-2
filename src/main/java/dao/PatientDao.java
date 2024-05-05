package dao;

import models.Patient;

import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

public class PatientDao {
    // Dummy database for storing patients
    public static Map<Integer, Patient> patientsDatabase = new HashMap<>(); 
    private int nextPatientIdentifier = 1; 

    // Create a new patient
    public Response createPatient(Patient patient) {
        if (patient == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Invalid patient data").build();
        }
        patient.setPatientIdentifier(nextPatientIdentifier++); 
        patientsDatabase.put(patient.getPatientIdentifier(), patient); 
        return Response.status(Response.Status.CREATED).entity(patient).build();
    }

    // Read a patient by ID
    public Response readPatientByIdentifier(int identifier) { 
        Patient patient = patientsDatabase.get(identifier); 
        if (patient == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Patient not found").build();
        }
        return Response.status(Response.Status.OK).entity(patient).build();
    }

    // Update an existing patient
    public Response updatePatientByIdentifier(int identifier, Patient updatedPatient) { 
        Patient existingPatient = patientsDatabase.get(identifier); 
        if (existingPatient == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Patient not found").build();
        }
        // Validate and update patient data
        // For simplicity, assume all fields can be updated
        existingPatient.setPersonName(updatedPatient.getPersonName());
        existingPatient.setPersonContactInfo(updatedPatient.getPersonContactInfo());
        existingPatient.setPersonAddress(updatedPatient.getPersonAddress());
        existingPatient.setPatientMedicalHistory(updatedPatient.getPatientMedicalHistory());
        existingPatient.setPatientCurrentHealthStatus(updatedPatient.getPatientCurrentHealthStatus());
        return Response.status(Response.Status.OK).entity(existingPatient).build();
    }

    // Delete an existing patient
    public Response deletePatientByIdentifier(int identifier) { 
        if (!patientsDatabase.containsKey(identifier)) { 
            return Response.status(Response.Status.NOT_FOUND).entity("Patient not found").build();
        }
        patientsDatabase.remove(identifier); 
        return Response.status(Response.Status.OK).entity("Patient deleted successfully").build();
    }
}

