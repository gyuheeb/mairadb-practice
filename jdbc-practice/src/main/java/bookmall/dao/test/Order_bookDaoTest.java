package bookmall.dao.test;

import java.util.List;

import bookmall.dao.Order_bookDao;
import bookmall.vo.Order_bookVo;



	public class Order_bookDaoTest {
		public static void main(String[] args) {
	//	testInsert();
		testFindAll();
		
	}
	

		
		private static void testInsert() {
			Order_bookVo vo =null;
			Order_bookDao dao = new Order_bookDao();
			
			
			vo = new Order_bookVo();
			vo.setTitle("트랜드코리아");
			vo.setCount(1L);
			vo.setOrder_no(1L);
			vo.setBook_no(7L);
			dao.insert(vo);
			
			vo = new Order_bookVo();
			vo.setTitle("모던 자바스크립트");
			vo.setCount(2L);
			vo.setOrder_no(2L);
			vo.setBook_no(8L);
			dao.insert(vo);
			
			
		}
		
		private static void testFindAll() {
			List<Order_bookVo> list = new Order_bookDao().findAll();
			for(Order_bookVo vo : list) {
				System.out.println(vo);
			}
		}
	}
		
	

