
package bmspackage;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Product {

    public Product() {
    }
    
    private int productID;
private String productName;
private String productType;
private String productBrand;
private double productPrice;
private String productDescription;

Connector con = new Connector();

    public Product(int productID, String productName, String productType, String productBrand, double productPrice,String productDescription) {
        this.productID = productID;
        this.productName = productName;
        this.productType = productType;
        this.productBrand = productBrand;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
 
    }

    public Product(int productID) {
        this.productID = productID;
    }
    

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }
    

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
@Override
public String toString(){
    return productName;
}

public void insertProduct() {
    
    String query = "INSERT INTO Product (productID, productName, productType, productBrand, productPrice, productDescription,productImage) " +
               "VALUES (" + this.productID + ", '" + this.productName + "', '" + this.productType + "', '" + this.productBrand + "', " +
               this.productPrice + ", '" + this.productDescription + "')";
    con.runDML(query);
    System.out.println("Added");
}

public void updateProduct() {
    String query = "UPDATE Product SET " +
                   "productName = '" + this.productName + "', " +
                   "productType = '" + this.productType + "', " +
                   "productBrand = '" + this.productBrand + "', " +
                   "productPrice = " + this.productPrice + ", " +
                   "productDescription = '" + this.productDescription + "' " +
                   "WHERE productID = " + this.productID;
    con.runDML(query);
    System.out.println("Updated");
}
public void removeProduct(int productID) {
    String query = "DELETE FROM Product WHERE ProductID = " + productID;
    con.runDML(query);
    System.out.println("Removed");
}
public ResultSet getProductInfo() {
        String query = "Select * from Product";
        ResultSet rs = con.runSelect(query);
        if (rs != null) {
            return rs;
        } else {
            return null;
        }
}
}