package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.获取连接对象
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/newdb3",
				"root", "123456");
		System.out.println(conn);
		//3.创建SQL执行对象
		Statement stat = conn.createStatement();
		//4.执行SQL
		String sql = "create table jdbct1"
				+ "(id int,name varchar(10));";
		stat.execute(sql);
		
		//5.关闭连接
		conn.close();
		System.out.println("执行完成！");
	}
}
