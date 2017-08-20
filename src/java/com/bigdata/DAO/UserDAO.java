/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.DAO;

import com.bigdata.model.UserModel;
import java.sql.SQLException;

/**
 *
 * @author suresh
 */
public interface UserDAO {
    void insert(UserModel u) throws SQLException,ClassNotFoundException;
    
    
}
