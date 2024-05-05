package dao;

import models.Billing;

import javax.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingDao {
    public static Map<Integer, Billing> billingsMap = new HashMap<>(); 
    private static int billingIdCounter = 1; 

    public List<Billing> getAllBillings() {
        return new ArrayList<>(billingsMap.values()); 
    }

    public Billing getBillingByIdentifier(int identifier) { 
        return billingsMap.get(identifier); 
    }

    public void createBilling(Billing billing) {
        billing.setBillingId(billingIdCounter++); 
        billingsMap.put(billing.getBillingId(), billing); 
    }

    public void updateBilling(int identifier, Billing updatedBilling) { 
        if (!billingsMap.containsKey(identifier)) { 
            throw new NotFoundException("Billing with ID " + identifier + " not found"); 
        }
        updatedBilling.setBillingId(identifier); 
        billingsMap.put(identifier, updatedBilling); 
    }

    public void deleteBilling(int identifier) { 
        if (!billingsMap.containsKey(identifier)) { 
            throw new NotFoundException("Billing with ID " + identifier + " not found"); 
        }
        billingsMap.remove(identifier); 
    }
}
