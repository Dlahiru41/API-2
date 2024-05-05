package resources;
import dao.DoctorDao;
import models.Doctor;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
@Path("/doctors")
public class DoctorResource {
    private DoctorDao doctorDao = new DoctorDao(); 

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createDoctor(Doctor doctor) {
        return doctorDao.createDoctor(doctor); 
    }

    @GET
    @Path("/{doctorIdentifier}") 
    @Produces("application/json")
    public Response getDoctorByIdentifier(@PathParam("doctorIdentifier") int identifier) { 
        return doctorDao.readDoctorByIdentifier(identifier); 
    }

    @PUT
    @Path("/{doctorIdentifier}") 
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateDoctorByIdentifier(@PathParam("doctorIdentifier") int identifier, Doctor updatedDoctor) { 
        return doctorDao.updateDoctorByIdentifier(identifier, updatedDoctor); 
    }

    @DELETE
    @Path("/{doctorIdentifier}") 
    public Response deleteDoctorByIdentifier(@PathParam("doctorIdentifier") int identifier) { 
        return doctorDao.deleteDoctorByIdentifier(identifier); 
    }
}

