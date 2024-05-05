package dao;

import models.Prescription;

import javax.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrescriptionDao {
    public static Map<Integer, Prescription> prescriptionsMap = new HashMap<>(); 
    private static int prescriptionIdCounter = 1; 

    public List<Prescription> getAllPrescriptions() {
        return new ArrayList<>(prescriptionsMap.values()); 
    }

    public Prescription getPrescriptionByIdentifier(int identifier) { 
        return prescriptionsMap.get(identifier); 
    }

    public void createPrescription(Prescription prescription) {
        prescription.setPrescriptionId(prescriptionIdCounter++); 
        prescriptionsMap.put(prescription.getPrescriptionId(), prescription); 
    }

    public void updatePrescription(int identifier, Prescription updatedPrescription) { 
        if (!prescriptionsMap.containsKey(identifier)) { 
            throw new NotFoundException("Prescription with ID " + identifier + " not found"); 
        }
        updatedPrescription.setPrescriptionId(identifier); 
        prescriptionsMap.put(identifier, updatedPrescription); 
    }

    public void deletePrescription(int identifier) { 
        if (!prescriptionsMap.containsKey(identifier)) { 
            throw new NotFoundException("Prescription with ID " + identifier + " not found"); 
        }
        prescriptionsMap.remove(identifier); 
    }
}
