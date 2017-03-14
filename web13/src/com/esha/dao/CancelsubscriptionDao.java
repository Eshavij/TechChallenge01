package com.esha.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Demo2.My_parent;
import com.esha.utils.DbConnection;
import com.mysql.jdbc.Connection;

public class CancelsubscriptionDao implements cancelDAO {

	public boolean AccountIdentifier(My_parent myParent) throws Exception{

        Connection connection = DbConnection.getConnection();      
        String uuid = myParent.creator.getUuid();    
     
        PreparedStatement prepareStatement = (PreparedStatement) connection.prepareStatement("select * from Product where uuid = ?");
        prepareStatement.setString(1,uuid);
        ResultSet resultSet = prepareStatement.executeQuery();
        while(resultSet.next()){
            return false;
        }
        return true;   
    }
public void cancel(My_parent myParent) throws Exception{
        
        Connection connection = DbConnection.getConnection();      
        String uuid = myParent.creator.getUuid();        
        
        PreparedStatement prepareStatement = (PreparedStatement) connection.prepareStatement("delete from Product where uuid=?");
        prepareStatement.setString(1, uuid);    
        prepareStatement.executeUpdate();
        System.out.println("**----User is removed Successfully---**");    
    }
}
