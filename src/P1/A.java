package P1;

import java.sql.Connection;
import java.sql.DriverManager;

public class A {

	
	public static void main(String[] args) {
		try {
		Connection con= DriverManager.getConnection
			("jdbc:mysql://127.0.0.1:3306/new_ram","root","text");
		System.out.println(con);
		} catch (Exception e) {
		e.printStackTrace();
	
		}

	}
}
