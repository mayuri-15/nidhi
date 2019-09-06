package com.cts.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.bean.RegisterBean;
import com.cts.bean.loginbean;
import com.cts.util.DBUtils;

public class RegisterDAOImpl implements RegisterDAO {


	public boolean registerUser(RegisterBean bean) {
		   Connection connection = null;
           String query = "insert into register values("?","?","?","?","?")";
           PreparedStatement preparedStatement = null;
           ResultSet resultSet = null;
           
           
           try {
                           connection = DBUtils.getConnection();
                           preparedStatement = connection.prepareStatement(query);
                           preparedStatement.setString(1, bean.getUname());
                           preparedStatement.setString(2, bean.getPwd());
                           resultSet = preparedStatement.executeQuery();
                           if(resultSet.next()) {
                                           return true;
                           }
                           else return false;
           } catch (SQLException e) {
                           // TODO Auto-generated catch block
                           e.printStackTrace();
           }
           finally {
        	   DBUtils.closeConnection(connection);
           }
		
		// TODO Auto-generated method stub
		return false;
	}

	
	}


