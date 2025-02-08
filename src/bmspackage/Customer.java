package bmspackage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer extends Person {
    private String customerMobile;
    private String customerEmail;
    private String customerCity;
    private String customerProvince;
    private String customerZipCode;

    Connector con = new Connector();

    public Customer(int personId, String personName, String contactInfo,String customerMobile, String personAddress, 
                     String customerCity, String customerProvince, String customerZipCode) {
        super(personId, personName, contactInfo, personAddress);
        this.customerMobile = customerMobile;
        this.customerEmail = customerEmail;
        this.customerCity = customerCity;
        this.customerProvince = customerProvince;
        this.customerZipCode = customerZipCode;
    }

  
    public Customer() {
        super(0, "", "", "", "");
        this.customerMobile = "";
        this.customerEmail = "";
        this.customerCity = "";
        this.customerProvince = "";
        this.customerZipCode = "";
    }

   
    @Override
    public void updateDetails() {
        String query = "UPDATE Customer SET " +
                       "customerName = '" + this.personName + "', " +
                       "customerEmail = '" + this.customerEmail + "', " +
                       "customerPhoneNumber = '" + this.customerMobile + "', " +
                       "customerAddress = '" + this.personAddress + "', " +
                       "customerCity = '" + this.customerCity + "', " +
                       "customerProvince = '" + this.customerProvince + "', " +
                       "customerZipCode = '" + this.customerZipCode + "' " +
                       "WHERE customerID = " + this.personId;
        con.runDML(query);
        System.out.println("Customer details updated.");
    }

    @Override
    public void add(int customerID, String personName, String customerEmail, String customerMobile,
                    String personAddress, String customerCity, String customerProvince, String customerZipCode) {
        String query = "INSERT INTO Customer (customerID, customerName, customerEmail, customerPhoneNumber, customerAddress, customerCity, customerProvince, customerZipCode) "
                     + "VALUES (" + customerID + ", '" + personName + "', '" + customerEmail + "', '" + customerMobile + "', '"
                     + personAddress + "', '" + customerCity + "', '" + customerProvince + "', '" + customerZipCode + "')";
        con.runDML(query);
        System.out.println("Customer added.");
    }

    @Override
    public void remove(int customerId) {
        String query = "DELETE FROM Customer WHERE customerID = " + customerId;
        con.runDML(query);
        System.out.println("Customer deleted.");
    }

    @Override
    public ResultSet getInfo() {
        String query = "SELECT * FROM Customer";
        return con.runSelect(query);
    }

    @Override
    public void search(int customerId) {
        String query = "SELECT * FROM Customer WHERE customerID = " + customerId;
        try {
            ResultSet rs = con.runSelect(query);
            if (rs.next()) {
                this.personId = rs.getInt("customerID");
                this.personName = rs.getString("customerName");
                this.contactInfo = rs.getString("customerPhoneNumber");
                this.personAddress = rs.getString("customerAddress");
                this.customerMobile = rs.getString("customerPhoneNumber");
                this.customerEmail = rs.getString("customerEmail");
                this.customerCity = rs.getString("customerCity");
                this.customerProvince = rs.getString("customerProvince");
                this.customerZipCode = rs.getString("customerZipCode");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerProvince() {
        return customerProvince;
    }

    public void setCustomerProvince(String customerProvince) {
        this.customerProvince = customerProvince;
    }

    public String getCustomerZipCode() {
        return customerZipCode;
    }

    public void setCustomerZipCode(String customerZipCode) {
        this.customerZipCode = customerZipCode;
    }
    @Override
public String toString() {
    return getPersonName(); // Assuming getPersonName() returns the name of the staff
}
}
