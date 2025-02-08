package bmspackage;

import java.sql.ResultSet;

public abstract class Person {
    protected int personId;
    protected String personName;
    protected String contactInfo;
    protected String personAddress;
    protected String personDob;

    public Person(int personId, String personName, String contactInfo, String personAddress, String personDob) {
        this.personId = personId;
        this.personName = personName;
        this.contactInfo = contactInfo;
        this.personAddress = personAddress;
        this.personDob = personDob;
    }

    public Person(int personId, String personName, String contactInfo, String personAddress) {
        this.personId = personId;
        this.personName = personName;
        this.contactInfo = contactInfo;
        this.personAddress = personAddress;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getPersonDob() {
        return personDob;
    }

    public void setPersonDob(String personDob) {
        this.personDob = personDob;
    }

    // Abstract methods to be overridden by subclasses
    public abstract void updateDetails();
    public abstract void add(int id, String name, String emailOrPosition, String mobileOrContactInfo, String address, String cityOrDob, String provinceOrAddress, String zipCodeOrNull);
    public abstract void remove(int id);
    public abstract ResultSet getInfo();
    public abstract void search(int id);
}
