package dao;

import models.Appointment;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppointmentDao {
    public static Map<Integer, Appointment> appointmentsMap = new HashMap<>(); 
    private static int appointmentIdCounter = 1; 

    public List<Appointment> getAllAppointments() {
        return new ArrayList<>(appointmentsMap.values()); 
    }

    public Appointment getAppointmentByIdentifier(int identifier) { 
        return appointmentsMap.get(identifier); 
    }

    public Response createAppointment(Appointment appointment) {
        if(appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null");
        }
        appointment.setAppointmentId(appointmentIdCounter++); 
        appointmentsMap.put(appointment.getAppointmentId(), appointment); 
        return Response.status(Response.Status.CREATED).entity(appointment).build();
    }

    public void updateAppointment(int identifier, Appointment updatedAppointment) { 
        if (!appointmentsMap.containsKey(identifier)) { 
            throw new NotFoundException("Appointment with ID " + identifier + " not found"); 
        }
        updatedAppointment.setAppointmentId(identifier); 
        appointmentsMap.put(identifier, updatedAppointment); 
    }

    public void deleteAppointment(int identifier) { 
        if (!appointmentsMap.containsKey(identifier)) { 
            throw new NotFoundException("Appointment with ID " + identifier + " not found"); 
        }
        appointmentsMap.remove(identifier); 
    }
}

