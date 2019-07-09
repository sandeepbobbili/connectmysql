package com.jdbc.connect.test;
import java.sql.*;
import com.crud.oper.Operations;
import com.jdbc.connect.DBConnection;
public class Test {
public static void main(String[] args) throws ClassNotFoundException, SQLException {

	Connection con= DBConnection.getConnectionInstance();
 
	Operations operations=new Operations();
//   operations.insert(con,9999,"manoj","hsc");
// operations.update(con,"cse","swap");
// operations.delete(con,"sandy");
     operations.get(con);
	}
}


