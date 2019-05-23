package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/newdb3", "root", "123456");
		
		Statement st = conn.createStatement();
		
		String sql = "insert into jdbct1 values(1,'Tom')";
		
		st.execute(sql);
		conn.close();
		System.out.println("执行完毕！");
	}
}
