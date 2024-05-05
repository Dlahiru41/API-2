package dao;

import models.Doctor;

import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

public class DoctorDao {
    // Dummy database for storing doctors
    public static Map<Integer, Doctor> doctorsDatabase = new HashMap<>(); // Renamed for clarity
    private int nextDoctorIdentifier = 1; // Renamed for clarity

    // Create a new doctor
    public Response createDoctor(Doctor doctor) {
        if (doctor == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Invalid doctor data").build();
        }
        doctor.setDoctorIdentifier(nextDoctorIdentifier++); // Renamed for clarity
        doctorsDatabase.put(doctor.getDoctorIdentifier(), doctor); // Renamed for clarity
        return Response.status(Response.Status.CREATED).entity(doctor).build();
    }

    // Read a doctor by ID
    public Response readDoctorByIdentifier(int identifier) { // Renamed for clarity
        Doctor doctor = doctorsDatabase.get(identifier); // Renamed for clarity
        if (doctor == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Doctor not found").build();
        }
        return Response.status(Response.Status.OK).entity(doctor).build();
    }

    // Update an existing doctor
    public Response updateDoctorByIdentifier(int identifier, Doctor updatedDoctor) { // Renamed for clarity
        Doctor existingDoctor = doctorsDatabase.get(identifier); // Renamed for clarity
        if (existingDoctor == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Doctor not found").build();
        }
        // Validate and update doctor data
        // For simplicity, assume all fields can be updated
        existingDoctor.setPersonName(updatedDoctor.getPersonName());
        existingDoctor.setPersonContactInfo(updatedDoctor.getPersonContactInfo());
        existingDoctor.setPersonAddress(updatedDoctor.getPersonAddress());
        existingDoctor.setDoctorSpecialization(updatedDoctor.getDoctorSpecialization());
        return Response.status(Response.Status.OK).entity(existingDoctor).build();
    }

    // Delete an existing doctor
    public Response deleteDoctorByIdentifier(int identifier) { // Renamed for clarity
        if (!doctorsDatabase.containsKey(identifier)) { // Renamed for clarity
            return Response.status(Response.Status.NOT_FOUND).entity("Doctor not found").build();
        }
        doctorsDatabase.remove(identifier); // Renamed for clarity
        return Response.status(Response.Status.OK).entity("Doctor deleted successfully").build();
    }
}

