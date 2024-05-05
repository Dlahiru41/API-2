package models;

public class Prescription {
    private int prescriptionId; 
    private int patientIdentifier; 
    private String medicationName; 
    private String medicationDosage; 
    private String medicationInstructions; 
    private String medicationDuration; 

    public Prescription(int prescriptionId, int patientIdentifier, String medicationName, String medicationDosage, String medicationInstructions, String medicationDuration) {
        this.prescriptionId = prescriptionId;
        this.patientIdentifier = patientIdentifier;
        this.medicationName = medicationName;
        this.medicationDosage = medicationDosage;
        this.medicationInstructions = medicationInstructions;
        this.medicationDuration = medicationDuration;
    }

    public Prescription() {
    }

    public int getPrescriptionId() { 
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) { 
        this.prescriptionId = prescriptionId;
    }

    public int getPatientIdentifier() { 
        return patientIdentifier;
    }

    public void setPatientIdentifier(int patientIdentifier) { 
        this.patientIdentifier = patientIdentifier;
    }

    public String getMedicationName() { 
        return medicationName;
    }

    public void setMedicationName(String medicationName) { 
        this.medicationName = medicationName;
    }

    public String getMedicationDosage() { 
        return medicationDosage;
    }

    public void setMedicationDosage(String medicationDosage) { 
        this.medicationDosage = medicationDosage;
    }

    public String getMedicationInstructions() { 
        return medicationInstructions;
    }

    public void setMedicationInstructions(String medicationInstructions) { 
        this.medicationInstructions = medicationInstructions;
    }

    public String getMedicationDuration() { 
        return medicationDuration;
    }

    public void setMedicationDuration(String medicationDuration) { 
        this.medicationDuration = medicationDuration;
    }
}
