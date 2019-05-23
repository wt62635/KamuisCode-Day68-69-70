package jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * JDBC工具类
 * @author Administrator
 *
 */
public class DBUtils {
	/*
	 * getConn()连接数据库，返回Connection对象conn;
	 */
	public static Connection getConn() throws Exception {
		Properties prop = new Properties();
		//获取文件输入流
		InputStream ips = DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(ips);
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		
		//注册驱动
		Class.forName(driver);
		//获取连接对象(读取配置文件)
		Connection conn = DriverManager.getConnection(url, username, password);
		
		return conn;
	}
	
	
}
