package bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookmall.vo.Order_bookVo;



public class Order_bookDao {
		//FINDALL
			public List<Order_bookVo> findAll() {
				List<Order_bookVo> result = new ArrayList<Order_bookVo>();
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					conn = getConnection();
					String sql = "select* from order_book";
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					
					while(rs.next()) {
						Long no = rs.getLong(1);
						String title  = rs.getString(2);
						Long Count = rs.getLong(3);
						Long order_no = rs.getLong(4);
						Long book_no = rs.getLong(5);
						
						
						Order_bookVo vo = new Order_bookVo();
						vo.setNo(no);
						vo.setTitle(title);
						vo.setOrder_no(order_no);
						vo.setBook_no(book_no);
						
						
						vo.setTitle(title);
						
						
						
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

			public void insert(Order_bookVo vo) {
				Connection conn = null;
				PreparedStatement pstmt = null;
				
				try {
					conn = getConnection();
					
					String sql = "insert into orders(no,title,count,order_no,book_no) values(null,?,?,?,?)";
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setString(1, vo.getTitle());
					pstmt.setLong(2, vo.getCount());
					pstmt.setLong(3, vo.getOrder_no());
					pstmt.setLong(4, vo.getBook_no());
					
					
				
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

