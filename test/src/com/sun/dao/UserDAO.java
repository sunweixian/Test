package com.sun.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.ConnDB.ConnDB;
import com.sun.beans.User1;

public class UserDAO {
	private ResultSet rs;
	private PreparedStatement pst;
	private Connection conn;
	public User1 getUser(){
		conn=ConnDB.getConn();
		try {
			pst=conn.prepareStatement("select * from users1");
			rs=pst.executeQuery();
			if(rs.next()){
				User1 user=new User1();
				user.setUserName(rs.getString("userName"));
				user.setUserPawd(rs.getString("userPawd"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close();
		}
		return null;
	}
	
	public void close(){
		try {
			if(rs!=null){
				rs.close();
				rs=null;
			}
			if(pst!=null){
				pst.close();
				pst=null;
			}
			if(conn!=null){
				conn.close();
				conn=null;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
