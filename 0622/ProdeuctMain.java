package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import java.util.Vector;

public class ProdeuctMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductProcess pp = new ProductProcess();
		pp.process();
	}

}
class Product
{
	private int num;
	private String name;
	private int price;
	
	public Product(int num, String name, int price)
	{
		super();
		this.num = num;
		this.name = name;
		this.price = price;
	}
	Product(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return num + "/"+ name + "/" + price;
	}
}
class ProductProcess
{
	Scanner sc = new Scanner(System.in);
	boolean bFlag = true;
	ServiceImpl service = new ServiceImpl();
	void process()
	{
		System.out.println("===================================");
		System.out.println("========제품 관리 프로그램 =============");
		System.out.println("===================================");
		while(bFlag)
		{
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 종료  2. 제품등록  3. 제품수정  4. 제품삭제  5. 제품검색  6. 전체제품목록");
			int menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				bFlag=false;
				service.close();
				System.out.println("프로그램 종료");
				break;
			case 2:
				addProduct();
				break;
			case 3:
				modifyProduct();
				break;
			case 4:
				deleteProduct();
				break;
			case 5:
				searchProduct();
				break;
			case 6:
				searchAll();
				break;
			}
		}
	}//process()
	void searchAll()
	{
		System.out.println("----------------------------------");
		System.out.println("전체 제품 목록");
		Vector<Product> al = service.selectAll();
		
		Iterator<Product> iter = al.iterator();
		while(iter.hasNext())
		{
			Product p = iter.next();
			System.out.println(p);
		}
		System.out.println("----------------------------------");
	}
	void searchProduct()
	{
		searchAll(); //전체 제품 목록 보여주고 시작
		System.out.println("검색하고자 하는 제품의 번호는");
		int num = sc.nextInt();
		Product p = service.select(num);
		System.out.println("검색결과는 다음과 같다.");
		if (p==null)
		{
			System.out.println("존재하지 않는 제품번호입니다.");
		}
		else
			System.out.println(p);
	}
	void deleteProduct()
	{
		//전체 출력하여 정보 보여주기
		searchAll();
		System.out.println("삭제하고자 하는 제품 번호는");
		int num = sc.nextInt();
		if(service.select(num)==null)
		{
			System.out.println("존재하지 않는 제품번호입니다.");
			return;
		}
		if(service.delete(num))
			System.out.println("삭제 성공");
		else
			System.out.println("삭제 실패");
	}
	void modifyProduct()
	{
		searchAll(); //전체 목록 보여주기
		System.out.println("수정하고 싶은 제품 번호는?");
		int num = sc.nextInt();
		if(service.select(num)==null)
		{
			System.out.println("존재하지 않는 제품번호입니다.");
			return;
		}
		System.out.print("제품명 :");
		String name = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		if(service.update(new Product(num,name,price)))
		{
			System.out.println("수정 성공");
		}
		else
			System.out.println("수정 실패");
	}
	void addProduct()
	{
		System.out.println("추가할 제품의 이름은?");
		String name = sc.next();
		System.out.println("추가할 제품의 가격 : ");
		int price = sc.nextInt();
		
		Product p = new Product(name, price);
		
		if(service.insert(p))
			System.out.println("제품을 추가하였습니다.");
		else
			System.out.println("제품 추가 실패");
	}
}
interface Dao
{
	boolean insert(Product p);
	boolean update(Product p);
	boolean delete(int num);
	Product select(int num);
	Vector<Product> selectAll();
	void close();
}
class DaoImple implements Dao
{
	private Connection conn;
	String sql;
	
	DaoImple()
	{
		DBConnect dbconn = DBConnect.getInstance();
		conn = dbconn.getConnection();
	}

	@Override
	public boolean insert(Product p) {
		// TODO Auto-generated method stub
		sql = "insert into product (name,price) values(?,?)";
		
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			num = pstmt.executeUpdate();
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		if(num<=0)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Product p) {
		// TODO Auto-generated method stub
		sql = "update product set name=?, price=? where num=?";
		PreparedStatement pstmt;
		int num = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			pstmt.setInt(3, p.getNum());
			
			num = pstmt.executeUpdate();
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		if(num<=0)
			return false;
		else
			return true;
	}

	@Override
	public boolean delete(int num) {
		// TODO Auto-generated method stub
		int result =0;
		sql ="delete from product where num=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result<=0)
			return false;
		else
			return true;
	}
	@Override
	public Product select(int num) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Product p = null;
		sql = "select * from product where num=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				int numData = rs.getInt("num");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				
				p = new Product(numData, name, price);
			}
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return p;
	}
	@Override
	public Vector<Product> selectAll() {
		// TODO Auto-generated method stub
		Vector<Product> al = new Vector<Product>();
		ResultSet rs;
		sql = "select * from product";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				
				Product p = new Product(num, name, price);
				al.add(p);
			}
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
interface Service
{
	boolean insert(Product p);
	boolean delete(int num);
	boolean update(Product p);
	Vector<Product> selectAll();
	Product select(int num);
	void close();
}
class ServiceImpl implements Service
{
	DaoImple dao = new DaoImple();
	@Override
	public boolean insert(Product p) {
		// TODO Auto-generated method stub
		return dao.insert(p);
	}

	@Override
	public boolean delete(int num) {
		// TODO Auto-generated method stub
		return dao.delete(num);
	}

	@Override
	public boolean update(Product p) {
		// TODO Auto-generated method stub
		return dao.update(p);
	}

	@Override
	public Vector<Product> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Product select(int num) {
		// TODO Auto-generated method stub
		return dao.select(num);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		dao.close();
	}	
}
class DBConnect
{
	String jdbc_driver="com.mysql.cj.jdbc.Driver";
	String jdbc_url = "jdbc:mysql://localhost:3306";
	private static DBConnect db = new DBConnect();
	private Connection conn=null;
	private DBConnect()
	{
		try {
			Class.forName(jdbc_driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "iotiot");
		properties.setProperty("autoReconnect", "true");
		
		try {
			conn = DriverManager.getConnection(jdbc_url, properties);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("커넥션 실패");
			e.printStackTrace();
		}
		try {
			Statement stmt = conn.createStatement();
			stmt.execute("create database if not exists addrdb");
			stmt.execute("use addrdb");
			stmt.execute("create table if not exists product (num int auto_increment primary key, name varchar(10), price int);");
			
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static DBConnect getInstance() {
		return db;
	}
	public Connection getConnection()
	{
		return conn;
	}
}