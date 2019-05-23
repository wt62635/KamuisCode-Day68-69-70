package jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo05 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		//获取文件输入流
		InputStream ips = Demo05.class.getClassLoader().getResourceAsStream("jdbc.properties");
		//加载文件流
		prop.load(ips);
		//获取数据
		String name = prop.getProperty("name");
		String age = prop.getProperty("age");
		System.out.println(name + ":" + age);
	}
}
