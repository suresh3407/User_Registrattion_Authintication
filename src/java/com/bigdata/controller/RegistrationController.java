/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.controller;

import com.bigdata.DAO.UserDAO;
import com.bigdata.DAOImp.UserDAOImp;
import com.bigdata.email.UserEmail;
import com.bigdata.model.UserModel;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author suresh
 */
@WebServlet(name = "registrationServlet", urlPatterns = "/register")
public class RegistrationController extends HttpServlet {

    private String userName;
    private String password;
    private String email;
    private UserDAO ud;

    public RegistrationController() {
        ud = new UserDAOImp();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //====gathering the data from form===================

        userName = req.getParameter("user-name");
        password = req.getParameter("password");
        email = req.getParameter("email");

        try {
            doRegister(new UserModel());

        } catch (Exception e) {
            resp.getWriter().println(e.toString());
        }

    }

    private void doRegister(UserModel u) throws SQLException, ClassNotFoundException {
        u.setUserName(userName);
        u.setPassword(password);
        u.setEmail(email);
        u.setAuthKey(getAuthKey("sushil123456"));
        ud.insert(u);
        String emailmessage = "hello, " + u.getUserName() + " click the link to confirm your <a href='#'>registration</a>";
        UserEmail um = new UserEmail("shiljungkc@gmail.com", "bijayabudhathoki98@gmail.com", "smtp.wlink.com.np", "registration confirmation", emailmessage);

    }

    private String getAuthKey(String keyContent) {

        StringBuilder finalContent = new StringBuilder(7);
        for (int i = 0; i < 10; i++) {

            finalContent.append(keyContent.charAt(new Random().nextInt(keyContent.length() - 1)));

        }
        return finalContent.toString();

    }

}
