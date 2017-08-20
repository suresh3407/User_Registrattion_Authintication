/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.DAOImp;

import com.bigdata.DAO.UserDAO;
import com.bigdata.DBWrapper.DBConnection;
import com.bigdata.model.UserModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author suresh
 */
public class UserDAOImp  implements UserDAO{
    private DBConnection db;

    public UserDAOImp() {
        db=new DBConnection();
    }
    
            

    @Override
    public void insert(UserModel u) throws SQLException, ClassNotFoundException {
        String sqlQuery="INSERT into tbl_users"
                + "(user_name,password,email,auth_key)"
                + "VALUES(?,?,?,?)";
        db.openConn();
        PreparedStatement ps= db.initStatement(sqlQuery);
        ps.setString(1, u.getUserName());
        ps.setString(2, u.getPassword());
        ps.setString(3, u.getEmail());
        ps.setString(4, u.getAuthKey());
        db.execute();
        db.closeConn();
      
        


    }
    
}
