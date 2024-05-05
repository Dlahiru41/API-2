package resources;
import dao.MedicalRecordDao;
import models.MedicalRecord;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/medicalrecords")
@Produces(MediaType.APPLICATION_JSON)
public class MedicalRecordResource {
    private MedicalRecordDao medicalRecordDao = new MedicalRecordDao(); 

    @GET
    @Produces("application/json")
    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordDao.getAllMedicalRecords(); 
    }

    @GET
    @Path("/{recordIdentifier}") 
    @Produces("application/json")
    public Response getMedicalRecordByIdentifier(@PathParam("recordIdentifier") int identifier) { 
        MedicalRecord medicalRecord = medicalRecordDao.getMedicalRecordById(identifier); 
        if (medicalRecord == null) {
            throw new NotFoundException("Medical record with ID " + identifier + " not found"); 
        }
        return Response.ok(medicalRecord).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordDao.createMedicalRecord(medicalRecord); 
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{recordIdentifier}") 
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateMedicalRecordByIdentifier(@PathParam("recordIdentifier") int identifier, MedicalRecord updatedMedicalRecord) { 
        medicalRecordDao.updateMedicalRecord(identifier, updatedMedicalRecord); 
        return Response.ok().build();
    }

    @DELETE
    @Path("/{recordIdentifier}") 
    public Response deleteMedicalRecordByIdentifier(@PathParam("recordIdentifier") int identifier) { 
        medicalRecordDao.deleteMedicalRecord(identifier); 
        return Response.noContent().build();
    }
}
