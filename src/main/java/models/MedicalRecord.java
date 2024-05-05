package models;

import java.util.List;

public class MedicalRecord {
    private int recordId; 
    private Patient patientRecord; 
    private List<String> medicalDiagnoses; 
    private List<String> medicalTreatments; 

    public MedicalRecord(int recordId, Patient patientRecord, List<String> medicalDiagnoses, List<String> medicalTreatments) {
        this.recordId = recordId;
        this.patientRecord = patientRecord;
        this.medicalDiagnoses = medicalDiagnoses;
        this.medicalTreatments = medicalTreatments;
    }

    public MedicalRecord() {
    }

    public int getRecordId() { 
        return recordId;
    }

    public void setRecordId(int recordId) { 
        this.recordId = recordId;
    }

    public Patient getPatientRecord() { 
        return patientRecord;
    }

    public void setPatientRecord(Patient patientRecord) { 
        this.patientRecord = patientRecord;
    }

    public List<String> getMedicalDiagnoses() { 
        return medicalDiagnoses;
    }

    public void setMedicalDiagnoses(List<String> medicalDiagnoses) { 
        this.medicalDiagnoses = medicalDiagnoses;
    }

    public List<String> getMedicalTreatments() { 
        return medicalTreatments;
    }

    public void setMedicalTreatments(List<String> medicalTreatments) { 
        this.medicalTreatments = medicalTreatments;
    }
}
