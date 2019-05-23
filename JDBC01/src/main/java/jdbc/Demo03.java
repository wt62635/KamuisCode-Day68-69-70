package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		//注册取得
		
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/newdb3", "root", "123456");
		//SQL执行对象
		Statement stat = conn.createStatement();
		String sql = "select * from emp";
		
		ResultSet rs = stat.executeQuery(sql);
		//遍历结果集
		while(rs.next()) {
			String name = rs.getString("ename");
			double sal = rs.getDouble("sal");
			System.out.println(name + ":" + sal);
		}
		conn.close();//关闭连接
	}
}
