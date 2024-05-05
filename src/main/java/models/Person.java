package models;

public class Person {
    // Attributes
    private String personName; 
    private String personContactInfo; 
    private String personAddress; 

    // Constructor
    public Person(String personName, String personContactInfo, String personAddress) {
        this.personName = personName;
        this.personContactInfo = personContactInfo;
        this.personAddress = personAddress;
    }
    public Person(){}

    // Getters and setters
    public String getPersonName() { 
        return personName;
    }

    public void setPersonName(String personName) { 
        this.personName = personName;
    }

    public String getPersonContactInfo() { 
        return personContactInfo;
    }

    public void setPersonContactInfo(String personContactInfo) { 
        this.personContactInfo = personContactInfo;
    }

    public String getPersonAddress() { 
        return personAddress;
    }

    public void setPersonAddress(String personAddress) { 
        this.personAddress = personAddress;
    }
}
