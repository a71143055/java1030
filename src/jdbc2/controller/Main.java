package jdbc2.controller;

import jdbc.JDBCConnector;
import jdbc2.entity.Customer;
import jdbc2.view.CustomerView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        Connection con = JDBCConnector.getConnection();
        String sql = "select * from 고객";
        PreparedStatement pstmt = null;
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        Customer customer = null;

        try {
            pstmt = con.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                customer = new Customer();
                customer.setCustomerName(result.getString("고객이름"));
                customer.setAge(result.getInt("나이"));
                customer.setLevel(result.getString("등급"));
                customer.setJob(result.getString("직업"));
                customer.setReward(result.getInt("적립금"));
                customerList.add(customer);
            }

            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        CustomerView view = new CustomerView();
        view.printHead();
        for (Customer c : customerList) {
            view.printCustomer(c);
        }
        view.printFooter();
    }
}