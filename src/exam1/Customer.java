package exam1;
import java.util.List;
public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private int phone;
    public List<Order> orders;
    public Customer(int customerId, String customerName, String address, int phone,List<Order>orders) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.orders = orders;
    }


    public void addCustomer(int customerId, String customerName, String address, int phone,List<Order> orders) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.orders=orders;
        System.out.println("Customer added: " + customerName);
    }
    public void editCustomer(String name, String address, Integer phone) {
        if (name != null && !name.isEmpty()) this.customerName = name;
        if (address != null && !address.isEmpty()) this.address = address;
        if (phone != null && phone > 0) this.phone = phone;
        System.out.println("Customer updated: " + this.customerName);
    }

    public void deleteCustomer() {
        this.customerId = 0;
        this.customerName = null;
        this.address = null;
        this.phone = 0;
        this.orders.clear();
        System.out.println("Customer deleted.");
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", ordersCount=" + orders.size() ;
    }
}
