package resources;
import dao.AppointmentDao;
import models.Appointment;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
@Path("/appointments")
public class AppointmentResource {
    private AppointmentDao appointmentDao = new AppointmentDao(); // Renamed for clarity

    @GET
    @Produces("application/json")
    public List<Appointment> getAllAppointments() {
        return appointmentDao.getAllAppointments(); // Renamed for clarity
    }

    @GET
    @Path("/{appointmentIdentifier}") // Renamed for clarity
    @Produces("application/json")
    public Response getAppointmentByIdentifier(@PathParam("appointmentIdentifier") int identifier) { // Renamed for clarity
        Appointment appointment = appointmentDao.getAppointmentByIdentifier(identifier); // Renamed for clarity
        if (appointment == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Appointment not found").build();
        }
        return Response.ok(appointment).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createAppointment(Appointment appointment) {
        appointmentDao.createAppointment(appointment); // Renamed for clarity
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{appointmentIdentifier}") // Renamed for clarity
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateAppointmentByIdentifier(@PathParam("appointmentIdentifier") int identifier, Appointment updatedAppointment) { // Renamed for clarity
        appointmentDao.updateAppointment(identifier, updatedAppointment); // Renamed for clarity
        return Response.ok().build();
    }

    @DELETE
    @Path("/{appointmentIdentifier}") // Renamed for clarity
    public Response deleteAppointmentByIdentifier(@PathParam("appointmentIdentifier") int identifier) { // Renamed for clarity
        appointmentDao.deleteAppointment(identifier); // Renamed for clarity
        return Response.noContent().build();
    }
}
