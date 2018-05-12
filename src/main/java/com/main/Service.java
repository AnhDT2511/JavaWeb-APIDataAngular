/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.dao.ProductDAO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.object.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Shado
 */
@WebServlet(urlPatterns = "/products")
public class Service extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        try (PrintWriter out = resp.getWriter()) {
//            ProductDAO pdao = new ProductDAO();
//            ArrayList<Product> list = pdao.getAll();
//            Gson gson = new Gson(); 
//            String json = gson.toJson(list, new TypeToken<List<Product>>() {}.getType());
//            out.println(json);

            out.println("Hello world!");
        }
    }

}
