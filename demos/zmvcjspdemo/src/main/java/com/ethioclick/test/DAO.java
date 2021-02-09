package com.ethioclick.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.When;

public class DAO {
	
	public boolean save(User user) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jspmvc","root","rootroot");			
			String sql= "INSERT INTO user(name,sex,foods,country,remarks) "
					+ "VALUES(?,?,?,?,?)";
			
			PreparedStatement preparedStatment = connection.prepareStatement(sql);
			preparedStatment.setString(1, user.getName());
			preparedStatment.setString(2, user.getSex());
			preparedStatment.setString(3, user.getFoods());
			preparedStatment.setString(4, user.getCountry());
			preparedStatment.setString(5, user.getRemarks());
			
			int execute = preparedStatment.executeUpdate();
			
			return execute>0;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public List<User> getAll(){
		List<User> users=new ArrayList<User>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jspmvc","root","rootroot");			
			String sql= "SELECT * FROM jspmvc.user";
			
			PreparedStatement preparedStatment = connection.prepareStatement(sql);
			ResultSet resultset= preparedStatment.executeQuery();
			User user=null;
			while(resultset.next()){
				user=new User();
				user.setName(resultset.getString(2));
				user.setSex(resultset.getString(3));
				user.setFoods(resultset.getString(4));
				user.setCountry(resultset.getString(5));
				user.setRemarks(resultset.getString(6));
				users.add(user);
			}
			
			return users;
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		User testuser=new User();
		testuser.setName("demo name2");
		testuser.setSex("F");
		testuser.setFoods("Shiro");
		testuser.setCountry("USA");
		testuser.setRemarks("it is good!");
		DAO dao= new DAO();
		boolean saved = dao.save(testuser);
		System.out.println("is saved:"+saved);
		
		
		List<User> users=dao.getAll();
		for(User user:users) {
			System.out.println("Name:"+user.getName());
		}
		
	}

}
