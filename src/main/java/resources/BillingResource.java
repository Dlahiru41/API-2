package resources;
import dao.BillingDao;
import models.Billing;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/billings")
public class BillingResource {
    private BillingDao billingDao = new BillingDao(); 

    @GET
    @Produces("application/json")
    public List<Billing> getAllBillings() {
        return billingDao.getAllBillings(); 
    }

    @GET
    @Path("/{billingIdentifier}") 
    @Produces("application/json")
    public Response getBillingByIdentifier(@PathParam("billingIdentifier") int identifier) { 
        Billing billing = billingDao.getBillingByIdentifier(identifier); 
        if (billing == null) {
            throw new NotFoundException("Billing with ID " + identifier + " not found"); 
        }
        return Response.ok(billing).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBilling(Billing billing) {
        billingDao.createBilling(billing); 
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{billingIdentifier}") 
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateBillingByIdentifier(@PathParam("billingIdentifier") int identifier, Billing updatedBilling) { 
        billingDao.updateBilling(identifier, updatedBilling); 
        return Response.ok().build();
    }

    @DELETE
    @Path("/{billingIdentifier}") 
    public Response deleteBillingByIdentifier(@PathParam("billingIdentifier") int identifier) { 
        billingDao.deleteBilling(identifier); 
        return Response.noContent().build();
    }
}
