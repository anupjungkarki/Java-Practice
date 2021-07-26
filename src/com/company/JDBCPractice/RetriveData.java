package com.company.JDBCPractice;
import java.io.IOException;
import java.sql.*;
public class RetriveData {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        // Driver connection
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/products","root","");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from  sales_product");

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

        conn.close();
    }
}
