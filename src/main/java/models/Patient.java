package models;

public class Patient extends Person {
    // Additional attribute specific to patients
    private int patientIdentifier; 
    private String patientMedicalHistory; 
    private String patientCurrentHealthStatus; 

    // Constructor
    public Patient(String personName, String personContactInfo, String personAddress, int patientIdentifier, String patientMedicalHistory, String patientCurrentHealthStatus) {
        // Call the constructor of the superclass (Person)
        super(personName, personContactInfo, personAddress);
        this.patientIdentifier = patientIdentifier;
        this.patientMedicalHistory = patientMedicalHistory;
        this.patientCurrentHealthStatus = patientCurrentHealthStatus;
    }

    public Patient() {
        super();
    }

    // Getter and setter for patientIdentifier
    public int getPatientIdentifier() { 
        return patientIdentifier;
    }

    public void setPatientIdentifier(int patientIdentifier) { 
        this.patientIdentifier = patientIdentifier;
    }

    // Getters and setters for additional attributes
    public String getPatientMedicalHistory() { 
        return patientMedicalHistory;
    }

    public void setPatientMedicalHistory(String patientMedicalHistory) { 
        this.patientMedicalHistory = patientMedicalHistory;
    }

    public String getPatientCurrentHealthStatus() { 
        return patientCurrentHealthStatus;
    }

    public void setPatientCurrentHealthStatus(String patientCurrentHealthStatus) { 
        this.patientCurrentHealthStatus = patientCurrentHealthStatus;
    }
}
