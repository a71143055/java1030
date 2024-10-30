package jdbc3.repository;

import jdbc.JDBCConnector;
import jdbc3.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductRepository {
    public static ArrayList<Product> getList() {
        ArrayList<Product> arrlist = new ArrayList<Product>();
        Connection con = JDBCConnector.getConnection();
        String sql = "select * from 제품";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setpNum(rs.getString("제품번호"));
                product.setpName(rs.getString("제품명"));
                product.setpStock(rs.getInt("재고량"));
                product.setpPrice(rs.getInt("단가"));
                product.setProduceName(rs.getString("제조업체"));
                arrlist.add(product);
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return arrlist;
    }
}