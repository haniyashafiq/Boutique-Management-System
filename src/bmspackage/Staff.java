package bmspackage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Staff extends Person {
    private String staffPosition;
 Connector con = new Connector();

    public Staff() {
        super(0, "", "", "", "");
        this.staffPosition = "";
    }

    public Staff(int personId, String personName, String contactInfo, String personAddress, String personDob, String staffPosition) {
        super(personId, personName, contactInfo, personAddress, personDob);
        this.staffPosition = staffPosition;
    }

    @Override
    public void updateDetails() {
        String query = "UPDATE Staff SET " +
                       "staffName = '" + this.personName + "', " +
                       "staffContactInformation = '" + this.contactInfo + "', " +
                       "staffAddress = '" + this.personAddress + "', " +
                       "staffDateOfBirth = '" + this.personDob + "', " +
                       "staffPosition = '" + this.staffPosition + "' " +
                       "WHERE staffID = " + this.personId;
        con.runDML(query);
        System.out.println("Staff details updated.");
    }

    @Override
    public void add(int staffID, String staffName, String staffPosition, String staffContactInformation, 
                    String staffAddress, String staffDateOfBirth, String null1, String null2) {
        String query = "INSERT INTO Staff (staffID, staffName, staffPosition, staffContactInformation, staffAddress, staffDateOfBirth) "
                     + "VALUES (" + staffID + ", '" + staffName + "', '" + staffPosition + "', '" + staffContactInformation + "', '"
                     + staffAddress + "', '" + staffDateOfBirth + "')";
        con.runDML(query);
        System.out.println("Staff member added.");
    }

    @Override
    public void remove(int staffID) {
        String query = "DELETE FROM Staff WHERE staffID = " + staffID;
        con.runDML(query);
        System.out.println("Staff member removed.");
    }

    @Override
    public ResultSet getInfo() {
        String query = "SELECT * FROM Staff";
        return con.runSelect(query);
    }

    @Override
    public void search(int staffID) {
        String query = "SELECT * FROM Staff WHERE staffID = " + staffID;
        try {
            ResultSet rs = con.runSelect(query);
            if (rs.next()) {
                this.personId = rs.getInt("staffID");
                this.personName = rs.getString("staffName");
                this.contactInfo = rs.getString("staffContactInformation");
                this.personAddress = rs.getString("staffAddress");
                this.personDob = rs.getString("staffDateOfBirth");
                this.staffPosition = rs.getString("staffPosition");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }
    @Override
public String toString() {
    return getPersonName(); // Assuming getPersonName() returns the name of the customer
}
}
