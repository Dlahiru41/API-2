package resources;

import dao.PatientDao;
import models.Patient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/patients")
public class PatientResource {
    private PatientDao patientDao = new PatientDao(); // Renamed for clarity

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPatient(Patient patient) {
        return patientDao.createPatient(patient); // Renamed for clarity
    }

    @GET
    @Path("/{patientIdentifier}") // Renamed for clarity
    @Produces("application/json")
    public Response getPatientByIdentifier(@PathParam("patientIdentifier") int identifier) { // Renamed for clarity
        return patientDao.readPatientByIdentifier(identifier); // Renamed for clarity
    }

    @PUT
    @Path("/{patientIdentifier}") // Renamed for clarity
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePatientByIdentifier(@PathParam("patientIdentifier") int identifier, Patient updatedPatient) { // Renamed for clarity
        return patientDao.updatePatientByIdentifier(identifier, updatedPatient); // Renamed for clarity
    }

    @DELETE
    @Path("/{patientIdentifier}") // Renamed for clarity
    public Response deletePatientByIdentifier(@PathParam("patientIdentifier") int identifier) { // Renamed for clarity
        return patientDao.deletePatientByIdentifier(identifier); // Renamed for clarity
    }
}
