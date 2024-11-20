package exam1;

import java.util.Date;

import java.util.ArrayList;
import java.util.List;

public class main {
                public static void main(String[] args) {
                        product prod1 = new product(101, 29.99f, "toy");
                        Stoke stock1 = new Stoke(1, 101, 50, prod1);
                        stock1.addStock(20);
                        List<Order> orders = new ArrayList<>();
                        Customer customer1 = new Customer(1, "maria", "123savar", 1234567890, orders);
                        Order order1 = new Order(prod1, 1, customer1, 101, 29.99f, new Date(), 1);
                        order1.createOrder();
                        orders.add(order1);
                        customer1.editCustomer("bob","102dhaka",268748272);
                        customer1.deleteCustomer();

                }
        }
