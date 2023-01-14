package bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookmall.vo.OrderVo;


public class OrderDao {
//FINDALL
	public List<OrderVo> findAll() {
		List<OrderVo> result = new ArrayList<OrderVo>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select a.no,b.name,b.email,d.price,a.address from orders a,user b,cart c, book d where a.user_no=b.no and b.cart_no=c.no and c.book_no=d.no";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Long no = rs.getLong(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				Long price=rs.getLong(4);
				String address  = rs.getString(5);

				OrderVo vo = new OrderVo();
				vo.setNo(no);
				vo.setName(name);
				vo.setEmail(email);
				vo.setPrice(price);
				vo.setAddress(address);
				
				
				result.add(vo);
			}

		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	//INSERT

	public void insert(OrderVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into orders(no,address,user_no) values(null,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getAddress());
			pstmt.setLong(2, vo.getUser_no());
			
			
		
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	private Connection getConnection() throws SQLException {
Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://192.168.10.118:3307/bookmall?charset=utf8";
			conn = DriverManager.getConnection(url, "bookmall", "bookmall");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		}
		
		return conn;
	}
}

