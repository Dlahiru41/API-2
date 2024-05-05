package models;

public class Doctor extends Person {
    // Additional attribute specific to doctors
    private int doctorIdentifier; 
    private String doctorSpecialization; 

    // Constructor
    public Doctor(String personName, String personContactInfo, String personAddress, int doctorIdentifier, String doctorSpecialization) {
        // Call the constructor of the superclass (Person)
        super(personName, personContactInfo, personAddress);
        this.doctorIdentifier = doctorIdentifier;
        this.doctorSpecialization = doctorSpecialization;
    }

    public Doctor() {
        super();
    }

    // Getter and setter for doctorIdentifier
    public int getDoctorIdentifier() { 
        return doctorIdentifier;
    }

    public void setDoctorIdentifier(int doctorIdentifier) { 
        this.doctorIdentifier = doctorIdentifier;
    }

    // Getter and setter for doctorSpecialization
    public String getDoctorSpecialization() { 
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) { 
        this.doctorSpecialization = doctorSpecialization;
    }
}

