package com.valens.datasource;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import javax.management.timer.Timer;

/**
 * 
 * @author Administrator
 * 
 */
public class DataSourceManager {
	{
		try {
			Driver driver = (Driver) (Class.forName("").newInstance());
			DriverManager.registerDriver(driver); // 
			// DriverManager.getConnection(url, user, password);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

class DBConnectionPool  //implements TimerListener
{
	private int checkedOut;// 已被分配出去的连接数
	private ArrayList freeConnections = new ArrayList();
	// 容器，空闲池，根据//创建时间顺序存放已创建但尚未分配出去的连接
	private int minConn;// 连接池里连接的最小数量
	private int maxConn;// 连接池里允许存在的最大连接数
	private String name;// 为这个连接池取个名字，方便管理
	private String password;// 连接数据库时需要的密码
	private String url;// 所要创建连接的数据库的地址
	private String user;// 连接数据库时需要的用户名
	public Timer timer;// 定时器

	public DBConnectionPool(String name, String URL, String user,
			String password, int maxConn) {
	};// 公开的构造函数

	public synchronized void freeConnection(Connection con) {
	};

	// 使用完毕之后，把连接返还给空闲池
	public synchronized Connection getConnection(long timeout) {
		return null;
	};

	// 得到一个连接，timeout是等待时间
	public synchronized void release() {
	}

	// 断开所有连接，释放占用的系统资源
	private Connection newConnection() {
		return null;
	}

	// 新建一个数据库连接
	public synchronized void TimerEvent() {
	}
	// 定时器事件处理函数
}

class DBConnectionManager {
	static private DBConnectionManager instance;
	// 连接池管理类的唯一实例
	static private int clients;// 客户数量
	// 容器，存放数据库驱动程序
	private ArrayList drivers = new ArrayList();

	// 以name/value的形式存取连接池对象的名字及连接池对象
	private HashMap pools = new HashMap();

	/**
	 * 如果唯一的实例instance已经创建，直接返回这个实例;否则，调用私有构造函数， 创建连接池管理类的唯一实例
	 */
	public static synchronized DBConnectionManager getInstance() {
		return null;
	};

	// 私有构造函数,在其中调用初始化函数init()
	private DBConnectionManager() {
	}

	// 释放一个连接，name是一个连接池对象的名字
	public void freeConnection(String name, Connection con) {

	}

	// 从名字为name的连接池对象中得到一个连接
	public Connection getConnection(String name) {
		return null;
	}

	// 从名字为name的连接池对象中取得一个连接，time是等待时间
	public Connection getConnection(String name, long time) {
		return null;
	}

	// 释放所有资源
	public synchronized void release() {
	};

	// 根据属性文件提供的信息，创建一个或多个连接池
	private void createPools(Properties props) {
	};

	// 初始化连接池管理类的唯一实例，由私有构造函数调用
	private void init() {

	}

	private void loadDrivers(Properties props) {
	};// 装载数据库驱动程序
}
