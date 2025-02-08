package bmspackage;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
public class Supplier {
    private int supplierID;
    private String supplierName;
    private String contactInformation;
private Connector con= new Connector();

    // Constructor
    public Supplier(int supplierID, String supplierName, String contactInformation) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.contactInformation = contactInformation;
    }

    public Supplier() {
    }

    public Supplier(int supplierID) {
        this.supplierID = supplierID;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    
    public void addSupplier() {
    String query = "INSERT INTO Supplier (supplierID, supplierName, contactInformation) " +
                   "VALUES (" + this.supplierID + ", '" + this.supplierName + "', '" + this.contactInformation + "')";
    con.runDML(query);
    System.out.println("Added");
}

    
    public void removeSupplier(int supplierID) {
    String query = "DELETE FROM Supplier WHERE SupplierID = " + supplierID;
    con.runDML(query);
    System.out.println("Removed");
    }

    public void updateSupplier() {
    String query = "UPDATE Supplier SET supplierName = '" + this.supplierName + 
                   "', contactInformation = '" + this.contactInformation + 
                   "' WHERE supplierID = " + this.supplierID;
    con.runDML(query);
    System.out.println("Updated");
}
  

    public ResultSet getProductInfo() {
        String query = "Select * from Supplier";
        ResultSet rs = con.runSelect(query);
        if (rs != null) {
            return rs;
        } 
        else {
            return null;
        }
    }
    public ResultSet getSupplierProductInfo() {
        String query = "Select * from Supplier_Product";
        ResultSet rs = con.runSelect(query);
        if (rs != null) {
            return rs;
        } 
        else {
            return null;
        }
    }
 public List<Product> getProductsBySupplier(int supplierID) {
        String query = "SELECT p.* FROM Product p " +
                       "JOIN Supplier_Product sp ON p.productID = sp.productID " +
                       "WHERE sp.supplierID = " + supplierID;
        ResultSet rs = con.runSelect(query);
        List<Product> products = new ArrayList<>();
        try {
            while (rs != null && rs.next()) {
                Product product = new Product(
                    rs.getInt("productID"),
                    rs.getString("productName"),
                    rs.getString("productType"),
                    rs.getString("productBrand"),
                    rs.getDouble("productPrice"),
                    rs.getString("productDescription")
                );
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    } 
}


