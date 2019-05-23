package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class Demo04 {
	@Test
	public void test01() {
		System.out.println("方法1执行了");
		try(Connection conn = DBUtils.getConn()) {
			//创建SQL执行对象
			Statement stat =  conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from emp");
			//遍历
			while(rs.next()) {
				String name = rs.getString("ename");
				System.out.println(name);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test02() {
		System.out.println("方法2执行了");
	}
	
	@Test
	public void test03() {
		System.out.println("方法3执行了");
	}
	
}
