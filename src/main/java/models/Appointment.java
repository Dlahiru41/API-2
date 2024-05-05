package models;

import models.*;

import java.util.Date;

public class Appointment {
    private int appointmentId;
    private Date appointmentTime;
    private Patient patient;
    private Doctor doctor;

    public Patient getPatient() {
        return patient;
    }

    public Appointment() {
    }

    public Appointment(int appointmentId, Date appointmentTime, Patient patient, Doctor doctor) {
        this.appointmentId = appointmentId;
        this.appointmentTime = appointmentTime;
        this.patient = patient;
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public long getPatientId() {
        return patient.getPatientIdentifier();
    }

    public long getDoctorId() {
        return doctor.getDoctorIdentifier();
    }
}
