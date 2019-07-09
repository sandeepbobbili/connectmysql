package com.jdbc.connect;
import com.jdbc.*;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class Connecttest {

	

	@Test
	void conntest() throws ClassNotFoundException, SQLException {
		DBConnection junit = new DBConnection();
		@SuppressWarnings("static-access")
		Connection result = junit.getConnectionInstance();
		assertEquals(null,result);
	}

}
