package bmspackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private int InventoryID;
    private Product product;
    private int Quantity;
    private int ReorderLevel;
    private String Location;
private Connector con= new Connector();

    public Inventory(int InventoryID, Product product, int Quantity, int ReorderLevel, String Location) {
        this.InventoryID = InventoryID;
        this.product = product;
        this.Quantity = Quantity;
        this.ReorderLevel = ReorderLevel;
        this.Location = Location;
    }

    public Inventory() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
 public void addProduct() {
        String query = "INSERT INTO Inventory (InventoryID, ProductID, Quantity, ReorderLevel, Location) " +
                       "VALUES (" + this.InventoryID + ", " +this.product.getProductID() + ", " + this.Quantity + ", " + this.ReorderLevel + ", '" +
                       this.Location + "')";
        con.runDML(query);
        System.out.println("Added");
    }
    
 public void removeProduct(int inventoryID) {
    String query = "DELETE FROM Inventory WHERE InventoryID = " + inventoryID;
    con.runDML(query);
    System.out.println("Removed");
}


    public void updateProduct() {
        String query = "UPDATE Inventory SET ProductID = " + this.product.getProductID() + 
                       ", Quantity = " + this.Quantity + 
                       ", ReorderLevel = " + this.ReorderLevel + 
                       ", Location = '" + this.Location + "'" +
                       " WHERE InventoryID = " + this.InventoryID;
        con.runDML(query);
        System.out.println("Updated");
    }

    public ResultSet getProductInfo() {
        String query = "Select * from Inventory";
        ResultSet rs = con.runSelect(query);
        if (rs != null) {
            return rs;
        } 
        else {
            return null;
        }
    }
    
  
    
    public List<Product> getProductsFromDatabase() {
    List<Product> products = new ArrayList<>();
    String query = "SELECT * FROM Product";
    ResultSet rs = con.runSelect(query);
    try {
        while (rs.next()) {
            int productID = rs.getInt("productID");
            String productName = rs.getString("productName");
            String productType = rs.getString("productType");
            String productBrand = rs.getString("productBrand");
            double productPrice = rs.getDouble("productPrice");
            String productDescription = rs.getString("productDescription");
            Product product = new Product(productID, productName, productType, productBrand, productPrice, productDescription);
            products.add(product);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return products;
}
}
    
   