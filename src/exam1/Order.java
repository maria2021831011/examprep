package exam1;

import java.util.Date;

public class Order {
    private int orderId;
    private int customerid;
    public Customer customer;
    private int productId;
    private float amount;
    public product p;
    private Date orderDate;
    public Order(product p,int orderId, Customer customer, int productId, float amount, Date orderDate, int customerid) {
        this.orderId = orderId;
        this.customer = customer;
        this.productId = productId;
        this.amount = amount;
        this.orderDate = orderDate;
        this.customerid = customerid;
        this.p=p;
    }


    public void createOrder() {
        System.out.println("Order created:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Product ID: " + productId);
        System.out.println("Amount: $" + amount);
        System.out.println("Order Date: " + orderDate);
    }
    public void editOrder(int orderId) {
     this.orderId=orderId;
        System.out.println("Order updated:");
        System.out.println("Order ID: " + orderId);
    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}


