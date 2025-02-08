
package bmspackage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class Order {
    
 private int orderID;
    private Customer customer;
    private String orderDate;
    private String orderStatus;
    private double totalAmount;
    private Staff staff;
    private String paymentMethod;

    Connector con = new Connector();

    // Constructors
    
    public Order(int orderID, Customer customer, String orderDate, String orderStatus, double totalAmount, Staff staff, String paymentMethod) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.totalAmount = totalAmount;
        this.staff = staff;
        this.paymentMethod = paymentMethod;
    }


    public Order() {
    }
   


    // Getters and Setters
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

 

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

 

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "orderID=" + orderID ;
    }

    // Method to add an order to the database
    public void addOrder() {
        String query = "INSERT INTO Order (orderID, customerID, orderDate, orderStatus, totalAmount, staffID, paymentMethod) "
                     + "VALUES (" + orderID + ", " + this.customer.getPersonId() + ", '" + orderDate + "', '"
                     + orderStatus + "', " + totalAmount + ", " + this.staff.getPersonId() + ", '" + paymentMethod + "')";
        con.runDML(query);
        System.out.println("Order added.");
    }

    // Method to update an order in the database
    public void updateOrder() {
        String query = "UPDATE Order SET "
                     + "customerID = " + this.customer.getPersonId() + ", "
                     + "orderDate = '" + orderDate + "', "
                     + "orderStatus = '" + orderStatus + "', "
                     + "totalAmount = " + totalAmount + ", "
                     + "staffID = " + this.staff.getPersonId() + ", "
                     + "paymentMethod = '" + paymentMethod + "' "
                     + "WHERE orderID = " + orderID;
        con.runDML(query);
        System.out.println("Order updated.");
    }

    // Method to remove an order from the database
    public void removeOrder(int orderID) {
        String query = "DELETE FROM Order WHERE orderID = " + orderID;
        con.runDML(query);
        System.out.println("Order removed.");
    }

    // Method to get order information
    public ResultSet getOrderInfo() {
        String query = "SELECT * FROM Order";
        return con.runSelect(query);
    }
    
    public List<Customer> getCustomersFromDatabase() {
    List<Customer> customers = new ArrayList<>();
    String query = "SELECT * FROM Customer";
    ResultSet rs = con.runSelect(query);
    try {
        while (rs.next()) {
            int customerID = rs.getInt("CustomerID");
            String customerName = rs.getString("CustomerName");
            String customerEmail = rs.getString("customerEmail");
            String customerPhoneNumber = rs.getString("customerPhoneNumber");
            String customerAddress = rs.getString("customerAddress");
            String customerCity = rs.getString("customerCity");
            String customerProvince = rs.getString("customerProvince");
            String customerZipCode = rs.getString("customerZipCode");
Customer customer = new Customer(customerID,customerName,customerEmail,customerPhoneNumber,customerAddress,customerCity,customerProvince,customerZipCode);
         customers.add(customer);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return customers;
}
    public List<Staff> getStaffFromDatabase() {
    List<Staff> staffs = new ArrayList<>();
    String query = "SELECT * FROM Staff";
    ResultSet rs = con.runSelect(query);
    try {
        while (rs.next()) {
            int staffID = rs.getInt("staffID");
            String staffName = rs.getString("staffName");
            String staffPosition = rs.getString("staffPosition");
            String staffContact = rs.getString("staffContactInformation");
            String staffAddress = rs.getString("staffAddress");
            String staffDateOfBirth = rs.getString("staffDateOfBirth");
 Staff staff = new Staff(staffID, staffName,staffPosition, staffContact,staffAddress,staffDateOfBirth);           
         staffs.add(staff);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return staffs;
}
    
}
