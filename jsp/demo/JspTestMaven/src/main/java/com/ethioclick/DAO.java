package com.ethioclick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	
	public boolean save(User user) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jspmvc","root","rootroot");
			
			String sql= "INSERT INTO user(name,sex,foods,country,remarks) "
					+ "VALUES (?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getSex());
			preparedStatement.setString(3, user.getFoods());
			preparedStatement.setString(4, user.getCountry());
			preparedStatement.setString(5, user.getRemark());
			int execute = preparedStatement.executeUpdate();
			System.out.println("is saved:"+execute);
			
			return execute>0;
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
public List<User> getAll() {
	List<User> users=new ArrayList<User>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jspmvc","root","rootroot");
			
			String sql= "SELECT * FROM jspmvc.user";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			User user=null;
			while(resultSet.next()) {
				user = new User();
				user.setName(resultSet.getString(1));
				user.setSex(resultSet.getString(2));
				user.setFoods(resultSet.getString(3));
				user.setCountry(resultSet.getString(4));
				user.setRemark(resultSet.getString(5));
				users.add(user);
			}
			
			return users;
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
