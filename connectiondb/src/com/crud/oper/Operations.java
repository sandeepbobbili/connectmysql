 package com.crud.oper;
import com.jdbc.connect.DBConnection;
import java.sql.*;
@SuppressWarnings("unused")
public class Operations {
       
	public void insert(Connection con,int studentId,String studentName,String branch) throws ClassNotFoundException, SQLException {
       
       
		Statement st = con.createStatement();
		String s = "INSERT INTO student(studentId,studentName,branch) VALUES("+studentId+","+"'"+studentName+"'"+","+"'"+branch+"'"+")";
		System.out.println(s);
         int value = st.executeUpdate(s);
         con.commit();
         System.out.println("Insert complete");
        }
      
	public void update(Connection con,String branch,String studentName) throws ClassNotFoundException, SQLException {
       
		Statement st = con.createStatement();
		String s = "UPDATE student SET branch='"+branch+"' where studentName = '"+studentName+"'";
		st.executeUpdate(s);
		con.commit();
        System.out.println("update complete");
        }
      
	
	
	public void delete(Connection con,String studentName) throws ClassNotFoundException, SQLException {
 
		Statement st = con.createStatement();
		String s = "DELETE from student where studentName = '"+studentName+"'";
		int rowsAffected = st.executeUpdate(s);
		con.commit();
		System.out.println("Rows Affected:" + rowsAffected);
		System.out.println("Delete Complete");
         
    
	}
	
	public void get(Connection con) throws ClassNotFoundException, SQLException
	{    
      
		Statement st = con.createStatement();
		ResultSet r =st.executeQuery("select * from student");
		while(r.next())
		{
			System.out.println(r.getInt("studentId")+ "," +r.getString("studentName")+","+r.getString("branch"));
		}
        }
     
	}
    
	

	
	
	

