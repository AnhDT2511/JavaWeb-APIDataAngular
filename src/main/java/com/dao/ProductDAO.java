/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.object.Image;
import com.object.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Shado
 */
public class ProductDAO{

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public ArrayList<Product> getAll() {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM product";
        try {
            connection = MySQLConnection.getMySQLConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setColorId(rs.getInt(2));
                product.setName(rs.getString(3));
                product.setPrice(rs.getInt(4));
                product.setSize(rs.getString(5));
                product.setDescription(rs.getString(6));
                product.setStatus(rs.getInt(7));
                product.setCategory(rs.getInt(8));
                product.setImage(new Image(rs.getString(9)));
                list.add(product);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            com.dao.MySQLConnection.closeResultSet(rs);
            com.dao.MySQLConnection.closePreparedStatement(ps);
            com.dao.MySQLConnection.closeConnection(connection);
        }
        return null;
    }

//    public static void main(String[] args) {
//        ProductDAO pdao = new ProductDAO();
//        System.out.println(pdao.getAll());       
//    }

}
