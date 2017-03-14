package com.esha.dao;

import java.sql.ResultSet;

import com.Demo2.My_parent;
import com.esha.utils.DbConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CreatesubscriptionDao implements createDAO{ 
public void add(My_parent myParent) throws Exception{
        
        Connection connection = DbConnection.getConnection();  
        String partner = myParent.marketplace.getPartner();
        String baseUrl = myParent.marketplace.getBaseUrl();
        String uuid = myParent.creator.getUuid();
        String firstName = myParent.creator.getFirstName();
        String lastName = myParent.creator.getLastName();
        String flag = myParent.getFlag();
        String email = myParent.creator.getEmail();
       
        PreparedStatement prepareStatement = (PreparedStatement) connection.prepareStatement("insert into Product values(?,?,?,?,?,?,?)");
        prepareStatement.setString(1, partner);
        prepareStatement.setString(2, baseUrl);
        prepareStatement.setString(3, uuid);
        prepareStatement.setString(4, firstName);
        prepareStatement.setString(5, lastName);
        prepareStatement.setString(6, flag);
        prepareStatement.setString(7, email);
       
        prepareStatement.executeUpdate();
        System.out.println("User is Inserted Successfully");
    }
    
    public boolean exit(My_parent myParent) throws Exception{
        Connection connection = DbConnection.getConnection();
        
        String uuid = myParent.creator.getUuid();
      
        PreparedStatement prepareStatement = (PreparedStatement) connection.prepareStatement("select * from Product where uuid = ?");
        prepareStatement.setString(1, uuid);
        
        ResultSet resultSet = prepareStatement.executeQuery();
        while(resultSet.next()){
            return false;
        }
        return true;
        
    }
}
