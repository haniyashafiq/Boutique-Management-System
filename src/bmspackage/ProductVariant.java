package bmspackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductVariant extends Product {

    private int variantID;
    private String size;
    private String color;
    private int stock;
    private Connector con = new Connector();

    public ProductVariant() {
        super();
    }
public ProductVariant(int variantID, int productID, String productName, String productType, String productBrand,
                      double productPrice, String productDescription, String size, String color, int stock) {
    super(productID, productName, productType, productBrand, productPrice, productDescription);
    this.variantID = variantID;
    this.size = size;
    this.color = color;
    this.stock = stock;
}

public ProductVariant(int variantID, int productID, String size, String color, int stock) {
    super(productID); // Assuming you want to use the default constructor for productName
    this.variantID = variantID;
    this.size = size;
    this.color = color;
    this.stock = stock;
}
//  public ProductVariant(int variantID, int productID, String productName, String productType, String productBrand,
//                      double productPrice, String productDescription, String size, String color, int stock) {
//    super(productID, productName, productType, productBrand, productPrice, productDescription); // Call superclass constructor to set productName
//    this.variantID = variantID;
//    this.size = size;
//    this.color = color;
//    this.stock = stock;
//}

    public ProductVariant(int variantID, String size, String color, int stock, int productID, String productName, String productType, String productBrand, double productPrice, String productDescription) {
        super(productID, productName, productType, productBrand, productPrice, productDescription);
        this.variantID = variantID;
        this.size = size;
        this.color = color;
        this.stock = stock;
    }
//     public ProductVariant(int variantID, int productID, String size, String color, int stock)
//     {
//         super(productID);
//        this.variantID = variantID;
//        this.size = size;
//        this.color = color;
//        this.stock = stock;
//    }


    public int getVariantID() {
        return variantID;
    }

    public void setVariantID(int variantID) {
        this.variantID = variantID;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.getProductName() + " (" + size + ", " + color + ")";
    }


    public void insertProductVariant() {
    String query = "INSERT INTO ProductVariant (variantID, productID, productSize, productColour, productStock) " +
                   "VALUES (" + this.variantID + ", " + this.getProductID() + ", '" + this.size + "', '" + this.color + "', " +
                   this.stock + ")";
    try {
        con.runDML(query);
        System.out.println("Added ProductVariant with ID: " + this.variantID);
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Error adding ProductVariant: " + e.getMessage());
    }
}
    
    
    public void updateProductVariant() {
        String query = "UPDATE ProductVariant SET " +
                       "productSize = '" + this.size + "', " +
                       "productColour = '" + this.color + "', " +
                       "productStock = " + this.stock + " " +
                       "WHERE variantID = " + this.variantID;
        con.runDML(query);
        System.out.println("Updated");
    }

    public void removeProductVariant(int variantID) {
        String query = "DELETE FROM ProductVariant WHERE variantID = " + variantID;
        con.runDML(query);
        System.out.println("Removed");
    }

    public ResultSet getProductVariantInfo() {
        String query = "Select * from ProductVariant";
        ResultSet rs = con.runSelect(query);
        if (rs != null) {
            return rs;
        } else {
            return null;
        }
    }
     
}
