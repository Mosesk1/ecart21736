package com.moses.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.moses.Controller.DbConnection;
import com.moses.Model.Item;


public class ItemDao {

	
public static void saveItem(int code, String name, String brandUnit, Double unitPrice, String quantity, LocalDate registrationDate) {
		
		try (Connection con=DbConnection.getConnected()){
			String sql_save_item="INSERT INTO clothingItems ( code,  name,  brandUnit,  unitPrice,  quantity,  registrationDate) values (?,?,?,?,?,?)";
			
			PreparedStatement statement=con.prepareStatement(sql_save_item);
			statement.setInt(1, code);
			statement.setString(2, name);
			statement.setString(3, brandUnit);
			statement.setDouble(4, unitPrice);
			statement.setString(5, quantity);
			statement.setDate(6, Date.valueOf(registrationDate));
			
			
			statement.execute();
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	
}

public static List<Item> getAllItems(){
	List<Item> itemList=new ArrayList<>();
	try (Connection con=DbConnection.getConnected()){
		String sql_get_all_items="SELECT * FROM clothingItems";
		
		PreparedStatement statement=con.prepareStatement(sql_get_all_items);
		
		ResultSet rs= statement.executeQuery();
		while(rs.next()) {
			 int code=rs.getInt(1);
			 String name=rs.getString(2);
			 String brandUnit=rs.getString(3);
			 Double unitPrice=rs.getDouble(4);
			 String quantity=rs.getString(5);
			 LocalDate registrationDate=rs.getDate(6).toLocalDate();
			 
			Item item=new Item(code,  name,  brandUnit,  unitPrice,  quantity,  registrationDate);
			itemList.add(item);
		
			
		}
		
	} catch (Exception ex) {
		
		ex.printStackTrace();
	}
return itemList;
	

}

public static Item getItemById(int id) throws SQLException {
	
	Item item = new Item();
	
	Connection con=DbConnection.getConnected();
	
	String query = "SELECT * FROM clothingItems WHERE code =?";
	
	PreparedStatement statement=con.prepareStatement(query);
	statement.setInt(1, id);
	
	ResultSet r= statement.executeQuery();
	
	while(r.next()) {
		 int code=r.getInt(1);
		 String name=r.getString(2);
		 String brandUnit=r.getString(3);
		 Double unitPrice=r.getDouble(4);
		 String quantity=r.getString(5);
		 LocalDate registrationDate=r.getDate(6).toLocalDate();
		 
		item=new Item(code,  name,  brandUnit,  unitPrice,  quantity,  registrationDate);
		
	
		
	}
	
	
	return item;
}
}
