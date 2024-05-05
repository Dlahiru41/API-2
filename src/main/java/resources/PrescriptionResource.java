package resources;
import dao.PrescriptionDao;
import models.Prescription;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/prescriptions")
public class PrescriptionResource {
    private PrescriptionDao prescriptionDao = new PrescriptionDao(); 

    @GET
    @Produces("application/json")
    public List<Prescription> getAllPrescriptions() {
        return prescriptionDao.getAllPrescriptions(); 
    }

    @GET
    @Path("/{prescriptionIdentifier}") 
    @Produces("application/json")
    public Response getPrescriptionByIdentifier(@PathParam("prescriptionIdentifier") int identifier) { 
        Prescription prescription = prescriptionDao.getPrescriptionByIdentifier(identifier); 
        if (prescription == null) {
            throw new NotFoundException("Prescription with ID " + identifier + " not found"); 
        }
        return Response.ok(prescription).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPrescription(Prescription prescription) {
        prescriptionDao.createPrescription(prescription); 
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{prescriptionIdentifier}") 
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePrescriptionByIdentifier(@PathParam("prescriptionIdentifier") int identifier, Prescription updatedPrescription) { 
        prescriptionDao.updatePrescription(identifier, updatedPrescription); 
        return Response.ok().build();
    }

    @DELETE
    @Path("/{prescriptionIdentifier}") 
    public Response deletePrescriptionByIdentifier(@PathParam("prescriptionIdentifier") int identifier) { 
        prescriptionDao.deletePrescription(identifier); 
        return Response.noContent().build();
    }
}
