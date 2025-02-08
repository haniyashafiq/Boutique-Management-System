package bmspackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetails {

    private int orderDetailID;
    private Order order;
    private ProductVariant productVariant;
    private int quantity;
    private double unitPrice;
    private double totalAmount;

    private Connector con = new Connector();

    // Constructors
    public OrderDetails(int orderDetailID, Order order, ProductVariant productVariant, int quantity, double unitPrice,double totalAmount) {
        this.orderDetailID = orderDetailID;
        this.order = order;
        this.productVariant = productVariant;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount= totalAmount;
    }

    public OrderDetails() {
    }

    // Getters and Setters
    public int getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(int orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ProductVariant getProductVariant() {
        return productVariant;
    }

    public void setProductVariant(ProductVariant productVariant) {
        this.productVariant = productVariant;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to add an order detail to the database
    public void addOrderDetail() {
        String query = "INSERT INTO OrderDetails (orderDetailID, orderID, productVariantID, quantity, unitPrice) "
                     + "VALUES (" + orderDetailID + ", " + order.getOrderID() + ", " + productVariant.getVariantID() + ", "
                     + quantity + ", " + unitPrice + ")";
        con.runDML(query);
        System.out.println("Order detail added.");
    }

    // Method to update an order detail in the database
    public void updateOrderDetail() {
        String query = "UPDATE OrderDetails SET "
                     + "orderID = " + order.getOrderID() + ", "
                     + "productVariantID = " + productVariant.getVariantID() + ", "
                     + "quantity = " + quantity + ", "
                     + "unitPrice = " + unitPrice + " "
                     + "WHERE orderDetailID = " + orderDetailID;
        con.runDML(query);
        System.out.println("Order detail updated.");
    }

    // Method to remove an order detail from the database
    public void removeOrderDetail(int orderDetailID) {
        String query = "DELETE FROM OrderDetails WHERE orderDetailID = " + orderDetailID;
        con.runDML(query);
        System.out.println("Order detail removed.");
    }

    // Method to get order details information
    public ResultSet getOrderDetailsInfo() {
        String query = "SELECT * FROM OrderDetails";
        return con.runSelect(query);
    }
 
  
   
        public List<Order> getOrdersFromDatabase() {
        List<Order> orders = new ArrayList<>();
        String query = "SELECT * FROM `Order`";
        ResultSet rs = con.runSelect(query);
        try {
            while (rs.next()) {
                int orderID = rs.getInt("orderID");
                int customerID = rs.getInt("customerID");
                String orderDate = rs.getString("orderDate");
                String orderStatus = rs.getString("orderStatus");
                double totalAmount = rs.getDouble("totalAmount");
                int staffID = rs.getInt("staffID");
                String paymentMethod = rs.getString("paymentMethod");

                // Inline query to get Customer details by ID
                Customer customer = null;
                String customerQuery = "SELECT * FROM Customer WHERE customerID = " + customerID;
                ResultSet customerRs = con.runSelect(customerQuery);
                try {
                    if (customerRs.next()) {
                        String customerName = customerRs.getString("customerName");
                        String customerEmail = customerRs.getString("customerEmail");
                        String customerPhoneNumber = customerRs.getString("customerPhoneNumber");
                        String customerAddress = customerRs.getString("customerAddress");
                        String customerCity = customerRs.getString("customerCity");
                        String customerProvince = customerRs.getString("customerProvince");
                        String customerZipCode = customerRs.getString("customerZipCode");
                        customer = new Customer(customerID, customerName, customerEmail, customerPhoneNumber, customerAddress, customerCity, customerProvince, customerZipCode);
                    }
                } finally {
                    if (customerRs != null) customerRs.close();
                }

                // Inline query to get Staff details by ID
                Staff staff = null;
                String staffQuery = "SELECT * FROM Staff WHERE staffID = " + staffID;
                ResultSet staffRs = con.runSelect(staffQuery);
                try {
                    if (staffRs.next()) {
                        String staffName = staffRs.getString("staffName");
                        String staffPosition = staffRs.getString("staffPosition");
                        String staffContact = staffRs.getString("staffContactInformation");
                        String staffAddress = staffRs.getString("staffAddress");
                        String staffDateOfBirth = staffRs.getString("staffDateOfBirth");
                        staff = new Staff(staffID, staffName, staffPosition, staffContact, staffAddress, staffDateOfBirth);
                    }
                } finally {
                    if (staffRs != null) staffRs.close();
                }

                Order order = new Order(orderID, customer, orderDate, orderStatus, totalAmount, staff, paymentMethod);
                orders.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return orders;
    }
 public List<ProductVariant> getProductVariantsFromDatabase() {
        List<ProductVariant> productVariants = new ArrayList<>();
        String query = "SELECT * FROM ProductVariant";
        ResultSet rs = con.runSelect(query);
        try {
            while (rs.next()) {
                int variantID = rs.getInt("variantID");
                int productID = rs.getInt("productID");
                String size = rs.getString("productSize");
                String color = rs.getString("productColour");
                int stock = rs.getInt("productStock");

                ProductVariant productVariant = new ProductVariant(variantID, productID, size, color, stock);
                productVariants.add(productVariant);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return productVariants;
    }       
}
